<jsp:useBean id="TableView" class="com.Sql.SQLselect" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ru">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View</title>
<jsp:include page="HTMLcomponent/BootstrapInc.html" flush="true" />
</head>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2"></div>
		<div class="span10">
			<p class="well inline-block">
				<strong>View User</strong>
			</p>
			<table class="table table-striped">
				<tbody>
					<c:forEach var="first" items="${TableView.listMind}">
						<tr>
							<c:forEach var="second" items="${first}">
								<td><c:out value="${second}" />
								<td>
							</c:forEach>
   						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
</body>
</html>