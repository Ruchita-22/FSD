<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<body>
	<form action="saveemp" method="post">
		Id: <input type=text name="id" /> <br /> 
		Name: <input type=text	name="name"> <br />
		 <input type=submit value="Add Emp" />
	</form>
	
	<table border=3>
		<tr><th>Id</th><th>Name</th></tr>
		<c:forEach items="${elist}" var="e">
				<tr>
					<th>${e.id}</th>
					<td>${e.name}</td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>