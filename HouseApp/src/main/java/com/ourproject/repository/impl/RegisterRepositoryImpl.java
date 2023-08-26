///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.ourproject.repository.impl;
//
//import com.ourproject.pojo.Role;
//import com.ourproject.pojo.User;
//import com.ourproject.repository.RegisteRepository;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// *
// * @author ahjhj
// */
//public class RegisterRepositoryImpl implements RegisteRepository {
//
//    @Autowired
//    private SessionFactory sessionFactory;
//    
//    @Override
//    public Role getRoleByName(String roleName) {
//        try (Session session = sessionFactory.openSession()) {
//            return session.createQuery("FROM Role Where RoleName = :RoleName", Role.class).setParameter("RoleName", roleName).uniqueResult();
//
//        }
//    }
//
//    @Override
//    public void saveUserToDatabase(User user) {
//try(Session sesion = sessionFactory.openSession()){
//            sesion.beginTransaction();
//            sesion.save(user);
//            sesion.getTransaction().commit();
//        }    }
//
//}
