/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.controllers;

import com.ourproject.pojo.Hostel;
import com.ourproject.pojo.Image;
import com.ourproject.pojo.PostForm;
import com.ourproject.pojo.Room;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author ahjhj
 */
@Controller
public class PostController {

    @GetMapping("/post")
    public String showPostForm() {
        return "post";
    }

    @PostMapping("/submit")
    public String submitPost(@ModelAttribute PostForm postForm, RedirectAttributes redirectAttributes) {
        try {
            
            String hostelName = postForm.getHostelName();
            String hostelAddress = postForm.getHostelAddress();
            String hostelPhone = postForm.getHostelPhone();
            String roomName = postForm.getRoomName();
            String roomDescription = postForm.getRoomDescription();
            Float roomPrice = postForm.getRoomPrice();
            List<MultipartFile> roomImage = postForm.getRoomImage();

            // Tạo danh sách chứa các đối tượng Hostel và Room mới
            Hostel unapprovedHostels = new Hostel();
            Room unapprovedRooms = new Room();
            
            Hostel hostel = new Hostel();
            hostel.setName(postForm.getHostelName());
            hostel.setAddress(postForm.getHostelAddress());
            hostel.setPhone(postForm.getHostelPhone());
            
            // Tạo đối tượng Room và sao chép giá trị từ postForm
            Room room = new Room();
            room.setName(postForm.getRoomName());
            room.setDescription(postForm.getRoomDescription());
            room.setPrice(postForm.getRoomPrice());
            
            // Thêm các đối tượng vào danh sách
            hostel.add(unapprovedHostels);
            room.add(unapprovedRooms);
            
            // Lưu danh sách vào re
            redirectAttributes.addAttribute("unapprovedHostels", unapprovedHostels);
            redirectAttributes.addAttribute("unapprovedRooms", unapprovedRooms);
            redirectAttributes.addFlashAttribute("postForm", postForm);
            
            //Tạo danh sách hình ảnh 
            List<Image> imageList = new ArrayList<>();

            // xử lý các hình ảnh 
            
            for ( MultipartFile roomImages : roomImage) {
                if (!roomImages.isEmpty()) {
                    byte[] imageBytes = roomImages.getBytes();
                    Image image = new Image();
                    image.setImageLinking("D:\\GuestHouse\\GuestHouseImages\\" + roomImages.getOriginalFilename());
                    imageList.add(image);
                    
                    //Lưu tạm 
                    String filePath = "D:\\GuestHouse\\GuestHouseImages\\" + roomImages.getOriginalFilename();
                    try(OutputStream os = new FileOutputStream(filePath)){
                        os.write(roomImages.getBytes());
                    }
                }
            }
            return "redirect:/admin";
        } catch (Exception e) {
            e.printStackTrace();
            return "errorPage";
        }
    }
}
        
            
