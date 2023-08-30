/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.pojo;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ahjhj
 */
public class PostForm {

    private String hostelName;
    private String hostelAddress;
    private String hostelPhone;
    private String roomName;
    private String roomDescription;
    private Float roomPrice;
    private List<MultipartFile> roomImage;

    public PostForm() {
    }

    public PostForm(String hostelName, String hostelAddress, String hostelPhone, String roomName, String roomDescription, Float roomPrice, MultipartFile roomImage) {
        this.hostelName = hostelName;
        this.hostelAddress = hostelAddress;
        this.hostelPhone = hostelPhone;
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.roomPrice = roomPrice;
        this.roomImage = (List<MultipartFile>) roomImage;
    }

    /**
     * @return the hostelName
     */
    public String getHostelName() {
        return hostelName;
    }

    /**
     * @param hostelName the hostelName to set
     */
    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    /**
     * @return the hostelAddress
     */
    public String getHostelAddress() {
        return hostelAddress;
    }

    /**
     * @param hostelAddress the hostelAddress to set
     */
    public void setHostelAddress(String hostelAddress) {
        this.hostelAddress = hostelAddress;
    }

    /**
     * @return the hostelPhone
     */
    public String getHostelPhone() {
        return hostelPhone;
    }

    /**
     * @param hostelPhone the hostelPhone to set
     */
    public void setHostelPhone(String hostelPhone) {
        this.hostelPhone = hostelPhone;
    }

    /**
     * @return the roomName
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * @param roomName the roomName to set
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * @return the roomDescription
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * @param roomDescription the roomDescription to set
     */
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    /**
     * @return the roomPrice
     */
    public Float getRoomPrice() {
        return roomPrice;
    }

    /**
     * @param roomPrice the roomPrice to set
     */
    public void setRoomPrice(Float  roomPrice) {
        this.roomPrice = roomPrice;
    }

    /**
     * @return the roomImage
     */
    public List<MultipartFile> getRoomImage() {
        return roomImage;
    }

    /**
     * @param roomImage the roomImage to set
     */
    public void  setRoomImage(List<MultipartFile> roomImage) {
        this.roomImage = roomImage;
    }
}
