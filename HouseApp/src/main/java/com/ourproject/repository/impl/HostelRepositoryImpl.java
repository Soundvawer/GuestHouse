/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.repository.impl;

import com.ourproject.pojo.Hostel;
import com.ourproject.repository.HostelRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.query.Query;
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
public class HostelRepositoryImpl implements HostelRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Hostel> getHostel() {
        Session session = this.factory.getObject().getCurrentSession();
        Query q = session.createQuery("FROM Hostel");
        return q.getResultList();
    }

    @Override
       public Hostel saveHostel(Hostel hostel){
           Session session = this.factory.getObject().getCurrentSession();
           session.save(hostel);
           return hostel;
       }
}
