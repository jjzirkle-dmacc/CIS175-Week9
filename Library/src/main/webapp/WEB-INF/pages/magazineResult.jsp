<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body>
	<h2>Magazine Inventory Results</h2>
	<table>
		<tr>
			<td>Title</td>
			<td>${m.title}</td>
		</tr>
		<tr>
			<td>Genre</td>
			<td>${m.genre}</td>
		</tr>
		<tr>
			<td>Publisher</td>
			<td>${m.publisher}</td>
		</tr>
		<tr>
			<td>Language</td>
			<td>${m.language}</td>
		</tr>
		<tr>
			<td>Issue</td>
			<td>${m.issue}</td>
		</tr>
	</table>
	<a href="viewAllMagazines.mvc">View all Magazines</a>
</body>
</html>