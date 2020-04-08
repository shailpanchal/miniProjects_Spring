<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locations</title>
</head>
<body>

<h2> Locations</h2>
<table>
<tr>
<th>id</th>
<th>code</th>
<th>name</th>
<th>type</th>
</tr>

<c:forEach items="${locations}" var="location"> <%-- traversing over all instance of locations --%>
<tr>
<td>${location.id}</td>
<td>${location.code}</td>
<td>${location.name}</td>
<td>${location.type}</td>
<td><a href="deleteLocation?id=${location.id}">delete</a></td> <%-- deleteLocation is href and ?id means we are passing the ID  --%>
<td><a href="showUpdate?id=${location.id}">edit</a></td>
</tr>
</c:forEach>
</table>

<a href="showCreate">Add location</a>

</body>
</html>