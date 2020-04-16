<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation details</title>
</head>
<body>

<h2> Flight details:</h2>
Airlines: ${reservation.flight.operatingAirlines} <br/>
Flight number: ${reservation.flight.flightNumber}<br/>
Departure City : ${reservation.flight.departureCity}<br/>
Arrival City: ${reservation.flight.arrivalCity}<br/>
Date of departure: ${reservation.flight.dateOfDeparture}<br/>
Estimated departure time: ${reservation.flight.estimatedDepartureTime}<br/>

<h2> Passenger Details:</h2>

First name: ${reservation.passenger.firstName} <br/>
Last name: ${reservation.passenger.lastName} <br/>
email: ${reservation.passenger.email} <br/>
phone: ${reservation.passenger.phone} <br/>

<form action="completeCheckIn" method="post">
<pre>
Enter the number of bags you want to check in: <input type="text" name="numberOfBags" />
<input type="hidden" value="${reservation.id}" name="reservationId"/>
<input type="submit" value="Check in"/>
</pre></form>


</body>
</html>