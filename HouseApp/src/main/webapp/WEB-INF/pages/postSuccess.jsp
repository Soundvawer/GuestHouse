<%-- 
    Document   : postSuccess
    Created on : Aug 27, 2023, 4:00:09 PM
    Author     : ahjhj
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng tin thành công</title>
        <style>
        
        .post-container form {
            border: 1px solid black;
            padding: 20px;
            border-radius: 5px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            font-weight: bold;
        }
        input[type="text"],
        input[type="tel"],
        input[type="number"],
        textarea {
            width: 95%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        </style>
    </head>
    <body>
        <h1>Đăng tin thành công</h1>
        <p>Bài đăng của bạn đã được lưu tạm thời. Vui lòng chờ quản trị viên duyệt.</p>
        
        <div class="container">
            <h1 class="text-center">Danh sách bài đăng</h1>

            <c:forEach var="post" items="${list_post}">
                <div class="post-container mx-auto">
                    <form style="max-width: 400px; margin: 0 auto; margin-bottom: 50px">
                        <div class="form-group">
                            <label for="hostelName">Tên Hostel:</label>
                            <input type="text" id="hostelName" name="hostelName" value="${post.hostelName}" readonly>
                        </div>
                        <div class="form-group">
                            <label for="hostelAddress">Địa chỉ Hostel:</label>
                            <input type="text" id="hostelAddress" name="hostelAddress" value="${post.hostelAddress}" readonly>
                        </div>
                            <div class="form-group">
                                <label for="roomPrice">Số điện thoại:</label>
                                <input type="number" id="roomPrice" name="roomPrice" value="${post.hostelPhone}" readonly>
                            </div>
                        <!-- Các trường input và textarea khác -->
                        <div class="form-group">
                            <label for="roomName">Tên phòng:</label>
                            <input type="text" id="roomName" name="roomName" value="${post.roomName}" readonly>
                        </div>
                            <div class="form-group">
                                <label for="roomDescription">Mô tả phòng:</label>
                                <input type="text" id="roomDescription" name="roomDescription" value="${post.roomDescription}" readonly>
                            </div>
                        <div class="form-group">
                            <label for="roomPrice">Giá phòng:</label>
                            <input type="number" id="roomPrice" name="roomPrice" value="${post.roomPrice}" readonly>
                        </div>
                        
                            <!-- Nút duyệt -->
                            <div class="form-group">
                                <a href="<c:url value='/approve?id=${post.id}&type=${post.type}'/>" class="btn btn-success">Duyệt</a>
                            </div>

                            <!-- Nút xóa -->
                            <div class="form-group">
                                <a href="<c:url value='/delete?id=${post.id}'/>" class="btn btn-danger">Xóa</a>
                            </div>
                    </form>
                </div>
            </c:forEach>

        
    </body>
</html>
