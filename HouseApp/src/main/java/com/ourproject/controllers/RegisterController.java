/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.controllers;

import com.ourproject.pojo.Role;
import static com.ourproject.pojo.Role_.roleID;
import com.ourproject.pojo.User;
import com.ourproject.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ahjhj
 */
@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @RequestMapping("/register")
    public String registerUser(Model model, @RequestParam String username,
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String role) {

        Role selectedRole = null;
        if (role.equals("nguoiTimTro")) {
            selectedRole = registerService.getRoleByName("Người tìm trọ"); // Lấy thông tin vai trò người tìm trọ từ cơ sở dữ liệu
        } else if (role.equals("nguoiChoThueTro")) {
            selectedRole = registerService.getRoleByName("Người cho thuê trọ"); // Lấy thông tin vai trò người cho thuê trọ từ cơ sở dữ liệu
        }

        if (selectedRole != null) {
            User newUser = new User(null, username, password, selectedRole);
            registerService.saveUserToDatabase(newUser); // Lưu thông tin người dùng vào cơ sở dữ liệu
        }
        return "redirect:/register";
    }
}
