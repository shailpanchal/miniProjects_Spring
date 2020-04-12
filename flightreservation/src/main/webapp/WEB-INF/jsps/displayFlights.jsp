<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display flights</title>
</head>
<body>

<h2> Flights: </h2>

<table>
<tr>
<th> Airline </th>
<th> Departure city  </th>
<th> Arrival city
<th>Departure time </th>
</tr>

<c:forEach items="${flights}" var="flight">
<tr>
<td>${flight.operatingAirlines} </td>
<td>${flight.departureCity}</td>
<td>${flight.arrivalCity}</td>
<td>${flight.dateOfDeparture} </td>
<td><a href="showCompleteReservation?flightId=${flight.id}">Select</a></td>
</tr>
</c:forEach>

</table>

</body>
</html>