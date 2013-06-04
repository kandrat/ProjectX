<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ru">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TestCarusel</title>
<%--Подключение HTML кода подключение Bootstrap--%>
<jsp:include page="HTMLcomponent/BootstrapInc.html" flush="true" />
</head>
<body>
	<!--Обвертывание страницы в контейнер-->
	<div class="container">
		<!--Head begin-->
		<div class="masthead">
			<ul class="nav nav-pills pull-right">
				<li><a href="/ProjectX/TestCrousel.jsp">Мысли</a></li>
				<li><a href="/ProjectX/Insert.jsp"><i class="icon-plus-sign"></i>Добавить мысль</a></li>
			</ul>
			<h3 class="muted">Мысли в слух...</h3>
		</div>
		<hr>
		<!-- Head END -->
		    <div class="alert alert-success">
           Ваша мысль успешно добавлена.
           </div>
	</div>
</body>
</html>