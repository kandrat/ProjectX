<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="HTMLcomponent/BootstrapInc.html" flush="true" />
<title>Error</title>
</head>
<body>
	<!--Обвертывание страницы в контейнер-->
	<div class="container">
		<%--Подключение Head (Меню+Заголовок) --%>
		<!--Head begin-->
		<div class="masthead">
			<ul class="nav nav-pills pull-right">
				<li><a href="/ProjectX/TestCrousel.jsp">Мысли</a></li>
				<li><a href="/ProjectX/Insert.jsp"><i class="icon-plus-sign icon-white"></i>Добавить
						мысль</a></li>
			</ul>
			<h3 class="muted">Мысли в слух...</h3>
		</div>
		<hr>
		<!-- Head END -->
		<!-- Alert сообщение -->
		    <div class="alert alert-error">
    <H1>Технические работы</H1>
    </div>
		</div>
</body>
</html>