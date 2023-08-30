/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.controllers;

import com.ourproject.pojo.Hostel;
import com.ourproject.pojo.PostForm;
import com.ourproject.pojo.Room;
import com.ourproject.service.HostelService;
import com.ourproject.service.RoomService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author ahjhj
 */
@Controller
public class AdminController {

    @Autowired
    private HostelService hostelService;

    @Autowired
    private RoomService roomService;

    @GetMapping("/admin")
//    public String showAdminPage(Model model, RedirectAttributes redirectAttributes) 
    public String showAdminPage(Model model){
//        List<Hostel> unapprovedHostels = (List<Hostel>) redirectAttributes.getFlashAttributes().get("unapprovedHostels");
//        List<Room> unapprovedRooms = (List<Room>) redirectAttributes.getFlashAttributes().get("unapprovedRooms");
//        
//        PostForm postForm = (PostForm) redirectAttributes.getAttribute("postForm");
//        model.addAttribute("unapprovedHostels", unapprovedHostels);        
//        model.addAttribute("unapprovedRooms", unapprovedRooms);
//        model.addAttribute("postForm", postForm);
        
        return "admin";
    }

    @PostMapping("/approve")
    public String approvePost(@RequestParam("type") String type, @RequestParam("id") int id) {
        if ("hostel".equals(type)) {
            hostelService.approveHostel(id);
        } else if ("room".equals(type)) {
            roomService.approveRoom(id);
        }
        return "redirect:/admin";

    }

}
