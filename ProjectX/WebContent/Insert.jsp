<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ru">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert</title>
<%--Подключение HTML кода подключение Bootstrap--%>
<jsp:include page="HTMLcomponent/BootstrapInc.html" flush="true" />
</head>
<body>
	<!--Обвертывание страницы в контейнер-->
	<div class="container">
		<jsp:include page="HTMLcomponent/Navibar.html" flush="true" />
		<!-- Форма ввода -->
		<div class="row-fluid">
			<div class="span3 offset5">
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
	</div>
</body>
</html>