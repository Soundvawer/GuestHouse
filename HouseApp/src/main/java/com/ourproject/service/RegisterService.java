/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ourproject.service;

import com.ourproject.pojo.Role;
import com.ourproject.pojo.User;
import org.springframework.stereotype.Service;

/**
 *
 * @author ahjhj
 */
@Service
public interface RegisterService {

    public Role getRoleByName(String roleName);

    public Void saveUserToDatabase(User user);
    // Lưu thông tin người dùng vào cơ sở dữ liệu

}
