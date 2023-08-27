<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Đăng tin cho thuê</title>
    </head>
    <body>
        <h1>Đăng tin cho thuê</h1>
        <form th:action="@{/post/save}"th:object="${temporaryPost}" method="post" enctype="multipart/form-data">
        <label for="hostelName">Tên nhà trọ:</label>
            <input type="text" id="hostelName" name="hostelName" required><br><br>

            <label for="hostelAddress">Địa chỉ nhà trọ:</label>
            <input type="text" id="hostelAddress" name="hostelAddress" required><br><br>

            <label for="hostelPhone">Số điện thoại liên hệ:</label>
            <input type="tel" id="hostelPhone" name="hostelPhone" required><br><br>

            <label for="roomName">Tên phòng:</label>
            <input type="text" id="roomName" name="roomName" required><br><br>

            <label for="roomDescription">Mô tả phòng:</label>
            <textarea id="roomDescription" name="roomDescription" required></textarea><br><br>

            <label for="roomPrice">Giá phòng:</label>
            <input type="number" id="roomPrice" name="roomPrice" required><br><br>

            <label for="roomImages">Hình ảnh phòng:</label>
            <input type="file" id="roomImages" name="roomImages" multiple accept="image/*"><br><br>

            <button type="submit">Gửi bài đăng</button>
        </form>
    </body>
</html>
