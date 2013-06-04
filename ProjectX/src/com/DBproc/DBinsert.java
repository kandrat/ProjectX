package com.DBproc;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Sql.SQLupdate;

/**
 * Servlet implementation class DBinsert.
 */
public class DBinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DBinsert() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// Сервлет обработки, записи в БД
	@SuppressWarnings("static-access")
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		// request param in Jsp с явным указанием 
		String TextMind = new String (request.getParameter("TextMind").getBytes("ISO-8859-1")); 
		String TextAuthor = new String (request.getParameter("TextAuthor").getBytes("ISO-8859-1"));
		String insertStat = null;
		String insertStatElse = null;
		System.out.println("Автор:"+TextAuthor);
		System.out.println("Мысль:"+TextMind);
		/* Блок проверки. Если длинна строки > 5, 
		 * то выполнить запись, инача перевод на .jsp
		*/
		if (TextMind.length() > 5 && TextAuthor.length() > 0) {
			try {
				// Отправка данных в запрос через обьект INSERT
				SQLupdate INSERT = new SQLupdate();
				INSERT.dbinsert(TextMind, TextAuthor);
				// Перевод на Insert
				insertStat="ok";
				request.setAttribute("inS", insertStat);
				RequestDispatcher dispacher = request
						.getRequestDispatcher("/Insert.jsp");
				dispacher.forward(request, response);
			} catch (Exception NullPointerException) {
				RequestDispatcher dispacher = request
						.getRequestDispatcher("/Error.jsp");
				dispacher.forward(request, response);
			}
		}else{
			insertStatElse ="error";
			request.setAttribute("inSe", insertStatElse);
			RequestDispatcher dispacher = request
				.getRequestDispatcher("/Insert.jsp");
		dispacher.forward(request, response); }
	}
}
