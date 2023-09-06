/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.controllers;

import com.ourproject.pojo.Hostel;
import com.ourproject.pojo.PostForm;
import com.ourproject.pojo.Room;
import com.ourproject.service.HostelService;
import com.ourproject.service.PostService;
import com.ourproject.service.RoomService;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ahjhj
 */
@Transactional
@Controller
public class PostController {

    @Autowired
    LocalSessionFactoryBean factory;

    @Autowired
    private PostService postService;

    @Autowired
    private HostelService hostelService;

    @Autowired
    private RoomService roomService;

    @GetMapping("/post")
    public String showPostForm(Model model) {
        model.addAttribute("postform", new PostForm());
        return "post";
    }

    @PostMapping("/post")
    public String add(@ModelAttribute(value = "postform") PostForm postForm, Model model) {
        Session session = factory.getObject().getCurrentSession();
        session.save(postForm);
        return "redirect:/";
    }

    @RequestMapping("/allpost")
    public String getAllPost(Model model) {
        Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM PostForm");
        model.addAttribute("list_post", q.getResultList());
        return "postSuccess";
    }

    @GetMapping("/approve")
    public String approvePost(@RequestParam("id") int id, @RequestParam("type") String type,
        @ModelAttribute("hostel") Hostel hostel,
        @ModelAttribute("room") Room room){
        PostForm postForm = postService.getPostById(id);

        if ("hostel".equals(type)) {
            // Tạo một đối tượng Hostel và sao chép dữ liệu từ PostForm
            hostel.setName(postForm.getHostelName());
            hostel.setAddress(postForm.getHostelAddress());
            hostel.setPhone(postForm.getHostelPhone());

            // Lưu đối tượng Hostel vào cơ sở dữ liệu (hoặc cập nhật nếu đã tồn tại)
            hostelService.saveHostel(hostel);
        } else if ("room".equals(type)) {
            // Tương tự như trường hợp Hostel, tạo một đối tượng Room và sao chép dữ liệu từ PostForm
            room.setName(postForm.getRoomName());
            room.setDescription(postForm.getRoomDescription());
            room.setPrice(postForm.getRoomPrice());

            // Lưu đối tượng Room vào cơ sở dữ liệu (hoặc cập nhật nếu đã tồn tại)
            roomService.saveRoom(room);
            
            // Sau khi duyệt, bạn có thể xóa bài đăng từ bảng PostForm
            postService.deletePost(id);
        }

        return "redirect:/allpost";

    }

    @GetMapping("/delete")
    public String deletePost(@RequestParam("id") int id) {
        postService.deletePost(id);
        return "redirect:/allpost";
    }

}
