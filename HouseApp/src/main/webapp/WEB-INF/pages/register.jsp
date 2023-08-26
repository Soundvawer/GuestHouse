<%-- 
    Document   : register
    Created on : Aug 26, 2023, 12:43:27 PM
    Author     : ahjhj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/register" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required><br>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>

            <label for="role">Select a role:</label>
            <select id="role" name="role" required>
                <option value="nguoiTimTro">Người tìm trọ</option>
                <option value="nguoiChoThueTro">Người cho thuê trọ</option>
            </select><br>

            <input type="submit" value="Đăng ký">
        </form>

    </body>
</html>
