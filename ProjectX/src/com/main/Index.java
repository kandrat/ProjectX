package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Index.
 */
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		//Start HTML page
		out.println("<!DOCTYPE html>");
		out.println("<Html>");
		out.println("<Head>");
		out.println("<Title>");
		out.println("Index Page");
		out.println("</Title>");
		out.println("</Head>");
		out.println("<Body>");
		// Connection bootstrap 
		out.println(com.ConnectionFramework.CSSbootstrap.BootstrapCSSincude);
		out.println(com.ConnectionFramework.JSbootstrap.BootstrapJSincude);
		//Insert components
		out.println(com.HTMLcomponents.Navibar.Navibar);
		out.println(com.HTMLcomponents.Texarea.Textarea);
		out.println("<br><br>Из метода<br>");
		out.println("<br><br>Из гетера<br>");
		out.println("</Body>");
		out.println("</Html>");
	}

}
