<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Đăng tin thuê nhà</title>
    </head>
    <body>
        <h1>Đăng tin thuê nhà</h1>
        <c:url value = "/post" var ="action"/>
        <form:form method="post" action="${action}" modelAttribute="postform" enctype="multipart/form-data" class="my-form">
            <!-- Hostel fields -->
            <label for="hostelName">Tên Hostel:</label>
            <input type="text" id="hostelName" name="hostelName" required><br><br>

            <label for="hostelAddress">Địa chỉ Hostel:</label>
            <input type="text" id="hostelAddress" name="hostelAddress" required><br><br>

            <label for="hostelPhone">Số điện thoại Hostel:</label>
            <input type="tel" id="hostelPhone" name="hostelPhone" required><br><br>

            <!-- Room fields -->
            <label for="roomName">Tên phòng:</label>
            <input type="text" id="roomName" name="roomName" required><br><br>

            <label for="roomDescription">Mô tả phòng:</label>
            <textarea id="roomDescription" name="roomDescription" required></textarea><br><br>

            <label for="roomPrice">Giá phòng:</label>
            <input type="number" id="roomPrice" name="roomPrice" required><br><br>
            
            <div class="form-group">
                <input type="submit" value="dăng bài" class="btn btn-danger" />
            </div>
        </form:form>
    </body>
</html>
