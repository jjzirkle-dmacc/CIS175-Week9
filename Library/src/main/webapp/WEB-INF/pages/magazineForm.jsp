<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Magazine Inventory Form</h2>
	<mvc:form modelAttribute="magazine" action="magazineResult.mvc">
		<table>
			<tr>
				<td><mvc:label path="title">Title</mvc:label></td>
				<td><mvc:input path="title" /></td>
			</tr>
			<tr>
				<td><mvc:label path="genre">Genre</mvc:label></td>
				<td><mvc:input path="genre" /></td>
			</tr>
			<tr>
				<td><mvc:label path="publisher">Publisher</mvc:label></td>
				<td><mvc:input path="publisher" /></td>
			</tr>
			<tr>
				<td><mvc:label path="language">Language</mvc:label></td>
				<td><mvc:select path="language" items="${language}" /></td>
			</tr>
			<tr>
				<td><mvc:label path="issue">Issue</mvc:label></td>
				<td><mvc:input path="issue" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</mvc:form>
	<a href="viewAll.mvc">View all Books</a>
</body>
</html>