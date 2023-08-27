<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Đăng tin thuê nhà</title>
    </head>
    <body>
        <h1>Đăng tin thuê nhà</h1>
        <form action="submit" method="post" enctype="multipart/form-data">
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

            <!-- Image field -->
            <label for="roomImage">Hình ảnh phòng:</label>
            <input type="file" id="roomImage" name="roomImage" accept="image/*"><br><br>

            <button type="submit">Gửi bài đăng</button>
        </form>
    </body>
</html>
