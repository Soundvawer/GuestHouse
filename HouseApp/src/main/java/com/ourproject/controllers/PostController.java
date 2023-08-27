/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.controllers;

import com.ourproject.pojo.TemporaryPost;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author ahjhj
 */
@Controller
@EnableWebMvc
@RequestMapping("/post")
public class PostController {
    @GetMapping
    public String showPostPage(){
        return "post";
    }
    
    @PostMapping("/save")
    public String saveTemporaryPost(TemporaryPost temporaryPost, HttpSession session){
        //Lưu thông tin vào session
        session.setAttribute("temporaryPost", temporaryPost);
        return "redirect:/post/success";
    }
    
    @GetMapping("/success")
    public  String showPostSuccess(){
        return "postSuccess";
    }
}

