/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.service.impl;

import com.ourproject.repository.PostRepository;
import com.ourproject.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

/**
 *
 * @author ahjhj
 */
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;


    @Override
    public void deletePost(int postId) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        String sql = "delete from postForm where id=?";
        jdbcTemplate.update(sql, postId);
    }

}
