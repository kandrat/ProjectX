<jsp:useBean id="TableView" class="com.Sql.SQLselect" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ru">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Подключение responsive дизайна -->
<jsp:include page="HTMLcomponent/ResponsiveInc.html" flush="true" />
<title>TestCarusel</title>
<%--Подключение HTML кода подключение Bootstrap--%>
<jsp:include page="HTMLcomponent/BootstrapInc.html" flush="true" />
<!-- code css for corusel  -->
<style type="text/css">
.container-narrow {
	background-color: #FFFFFF;
	background-image: url("grid-18px-masked-1.png");
	background-position: 0 40px;
	background-repeat: repeat-x;
	padding-top: 50px;
	position: relative;
}

.carousel-control {
	background-color: transparent;
	color: #000000;
	border: 0 none;
	font-size: 120px;
	margin-top: 0;
	text-shadow: 0 1px 1px rgba(0, 0, 0, 0.4);
}

.carousel-control:hover {
	color: #999999;
	opacity: 0.9;
	text-decoration: none;
}

.carousel-control:focus {
	color: #999999;
	text-decoration: none;
	opacity: 0.9;
	filter: alpha(opacity =     90);
}
</style>
<!-- END css corusel code  -->
</head>
<body>
	<!--Обвертывание страницы в контейнер-->
	<div class="container-narrow">
		<!--Head begin-->
		<div class="masthead">
			<ul class="nav nav-pills pull-right">
				<li class="active"><a href="/ProjectX/TestCrousel.jsp">Мысли</a></li>
				<li><a href="/ProjectX/Insert.jsp"><i
						class="icon-plus-sign"></i>Добавить мысль</a></li>
			</ul>
			<h3 class="muted">Name...</h3>
		</div>
		<hr>
		<!-- Head END -->
		<div class="carousel slide" id="myCarousel">
			<!-- Carousel items -->
			<div class="carousel-inner">
				<%--Вывод из Benn --%>
				<div class="active item">
					<div class="container-narrow">
						<div class="row-fluid marketing">
							<div class="span10 offset2">
								<H3>
									<c:out value="${TableView.listMind[0][1]}" />
								</H3>
								<br>
								<div class="span12 offset6">
									<h4>
										<c:out value="${TableView.listMind[0][2]}" />
									</h4>
								</div>
							</div>
						</div>
					</div>
				</div>
				<c:forEach var="first" begin="1" end="${TableView.listMindSize}"
					items="${TableView.listMind}">
					<div class="item">
						<div class="container-narrow">
							<div class="row-fluid marketing">
								<div class="span10 offset1">
									<H3>
										<c:out value="${first[1]}" />
									</H3>
									<br>
									<div class="span12 offset10">
									<h4>
										<c:out value="-${first[2]}" />
									</h4>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
			<a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
			<a class="carousel-control right" href="#myCarousel"
				data-slide="next">&rsaquo;</a>
		</div>
	</div>
	<script src="bootstrap/js/jquery-latest.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>