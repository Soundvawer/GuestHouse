<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home page</title>
</head>
<body>
    <h1>Hostels:</h1>
    <ul>
        <c:forEach var="hostel" items="${hostels}">
            <li>${hostel.name}</li>
        </c:forEach>
    </ul>

    <h1>Rooms:</h1>
    <ul>
        <c:forEach var="room" items="${rooms}">
            <li>${room.name}</li>
        </c:forEach>
    </ul>
</body>
</html>
