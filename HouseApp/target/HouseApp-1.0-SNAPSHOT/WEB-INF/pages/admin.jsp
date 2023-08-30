<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Trang quản trị viên</title>
    </head>
    <body>
        <h1>Trang quản trị viên</h1>
        <h2>Danh sách nhà thuê đang chờ duyệt:</h2>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Tên</th>
                <th>Địa chỉ</th>
                <th>Số điện thoại</th>
                <th>Duyệt</th>
            </tr>
            <c:forEach items="${unapprovedHostels}" var="hostel">
                <tr>
                    <td>${hostel.hostelID}</td>
                    <td>${hostel.name}</td>
                    <td>${hostel.address}</td>
                    <td>${hostel.phone}</td>
                    <td>
                        <form action="approve" method="post">
                            <input type="hidden" name="type" value="hostel">
                            <input type="hidden" name="id" value="${hostel.hostelID}">
                            <button type="submit">Duyệt</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <h2>Danh sách phòng chờ duyệt:</h2>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Tên</th>
                <th>Mô tả</th>
                <th>Giá</th>
                <th>Duyệt</th>
            </tr>
            <c:forEach items="${unapprovedRooms}" var="room">
                <tr>
                    <td>${room.roomID}</td>
                    <td>${room.name}</td>
                    <td>${room.description}</td>
                    <td>${room.price}</td>
                    <td>
                        <form action="approve" method="post">
                            <input type="hidden" name="type" value="room">
                            <input type="hidden" name="id" value="${room.roomID}">
                            <button type="submit">Duyệt</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
