/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.repository.impl;

import com.ourproject.pojo.Room;
import com.ourproject.repository.RoomRepository;
import java.lang.annotation.Annotation;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ahjhj
 */
@Repository
@Transactional
public class RoomRepositoryImpl implements RoomRepository{
    @Autowired
    private LocalSessionFactoryBean factory;
    @Override
    public List<Room> getRooms(){
        Session session = this.factory.getObject().getCurrentSession();
        Query q = session.createQuery("FROM Room");
        return q.getResultList();
    }
   
}

