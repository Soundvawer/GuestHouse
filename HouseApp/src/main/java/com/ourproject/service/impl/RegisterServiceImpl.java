/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.service.impl;

import com.ourproject.pojo.Role;
import com.ourproject.pojo.User;
import com.ourproject.service.RegisterService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ahjhj
 */
public class RegisterServiceImpl implements RegisterService {

    @Autowired
   private SessionFactory sessionFactory;
    

    @Override
    public Role getRoleByName(String roleName) {
        // Truy vấn cơ sở dữ liệu để lấy thông tin vai trò dựa vào tên
       try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Role Where RoleName = :RoleName", Role.class).setParameter("RoleName", roleName).uniqueResult();
        
    }

    @Override
    public Void saveUserToDatabase(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
// Trả về đối tượng Role

