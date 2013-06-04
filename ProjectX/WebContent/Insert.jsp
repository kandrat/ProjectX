<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ru">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Подключение responsive дизайна -->
<jsp:include page="HTMLcomponent/ResponsiveInc.html" flush="true" />
<title>Insert</title>
<%--Подключение HTML кода подключение Bootstrap--%>
<jsp:include page="HTMLcomponent/BootstrapInc.html" flush="true" />
</head>
<body>
	<!--Обвертывание страницы в контейнер-->
	<div class="container-narrow">
		<%--Подключение Head (Меню+Заголовок) --%>
		<!--Head begin-->
		<div class="masthead">
			<ul class="nav nav-pills pull-right">
				<li><a href="/ProjectX/TestCrousel.jsp">Мысли</a></li>
				<li class="active"><a href="/ProjectX/Insert.jsp"><i class="icon-plus-sign icon-white"></i>Добавить
						мысль</a></li>
			</ul>
			<h3 class="muted">Name...</h3>
		</div>
		<hr>
		<!-- Head END -->
		<div class="row-fluid marketing">
		<div class="span5 offset7">
		<%--Проверка выполнения записи в бд.--%>
		<%
		String insertS =(String) request.getAttribute("inS");
		if(insertS != null){
			out.println("<div class='alert alert-success'>");
		    out.println("Успех");
		    out.println("</div>");
			System.out.println("Status:"+insertS);
		}
		String insertSe =(String) request.getAttribute("inSe");
		if(insertSe != null){
			out.println("<div class='alert alert-error'>");
			out.println("Error");
			out.println("</div>");
			System.out.println("Status:"+insertSe);
		}
		%>
		<%--END проверки--%>
		</div>
		</div>
		<!-- Форма ввода -->
		<div class="row-fluid marketing">
			<div class="span5 offset7">
				<form action="DBinsert">
					<div class="well">
						<textarea class="span12" name="TextMind"></textarea>
						<input class="span12" type="text" name="TextAuthor" /> <br>
						<input class='btn btn-success btn-large btn-block' type='submit'
							value='Добавить мысль' />
					</div>
				</form>
			</div>
		</div>
<jsp:include page="HTMLcomponent/Footer.html" flush="true" />
	</div>
</body>
</html>