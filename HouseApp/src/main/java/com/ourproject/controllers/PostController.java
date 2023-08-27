/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.controllers;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ahjhj
 */
@Controller
public class PostController {
    
    @GetMapping("/post")
    public String showPostForm(){
        return "post";
    }
    
    @PostMapping("/submit")
    public String submitPost(HttpServletRequest request, MultipartFile roomImage){
        String hostelName = request.getParameter("hostelName");
        String hostelAddress = request.getParameter("hostelAddress");
        String hostelPhone = request.getParameter("hostelPhone");
        String roomName = request.getParameter("roomName");
        String roomDescription = request.getParameter("roomDescription");
        String roomPrice = request.getParameter("roomPrice");

        return  "redirect:/post";
    }
    
    
    @GetMapping("/success")
    public  String showPostSuccess(){
        return "postSuccess";
    }
}

