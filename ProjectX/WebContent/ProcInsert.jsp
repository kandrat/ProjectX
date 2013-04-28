<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ru">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProcInsert</title>
<jsp:include page="HTMLcomponent/BootstrapInc.html" flush="true" />
</head>
<body>
	<!--Обвертывание страницы в контейнер-->
	<div class="container">
		<jsp:include page="HTMLcomponent/Navibar.html" flush="true" />
		<div class="container">
			<div class="row-fluid">
				<div class="span 12">
					<div class="alert alert-success">
						<strong>Успех!</strong>Вы успешно добавили свою мысль.
					</div>
				</div>
				 <jsp:useBean id="select" class="com.Sql.SQLselect" />
  <jsp:getProperty name="select" property="element"/>
			</div>
		</div>
	</div>
</body>
</html>