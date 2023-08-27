/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.pojo;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ahjhj
 */
public class TemporaryPost {
    private String hostelName;
    private String hostelAddress;
    private String hostelPhone;
    private String roomName;
    private String roomDescription;
    private float roomPrice;
    private MultipartFile roomImages;

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
    public float getRoomPrice() {
        return roomPrice;
    }

    /**
     * @param roomPrice the roomPrice to set
     */
    public void setRoomPrice(float roomPrice) {
        this.roomPrice = roomPrice;
    }

    /**
     * @return the roomImages
     */
    public MultipartFile getRoomImages() {
        return roomImages;
    }

    /**
     * @param roomImages the roomImages to set
     */
    public void setRoomImages(MultipartFile roomImages) {
        this.roomImages = roomImages;
    }
}
