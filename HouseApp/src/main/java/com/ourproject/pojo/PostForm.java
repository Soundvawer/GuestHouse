/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author minh tai
 */
@Entity
@Table(name = "post_form")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PostForm.findAll", query = "SELECT p FROM PostForm p"),
    @NamedQuery(name = "PostForm.findById", query = "SELECT p FROM PostForm p WHERE p.id = :id"),
    @NamedQuery(name = "PostForm.findByHostelName", query = "SELECT p FROM PostForm p WHERE p.hostelName = :hostelName"),
    @NamedQuery(name = "PostForm.findByHostelAddress", query = "SELECT p FROM PostForm p WHERE p.hostelAddress = :hostelAddress"),
    @NamedQuery(name = "PostForm.findByHostelPhone", query = "SELECT p FROM PostForm p WHERE p.hostelPhone = :hostelPhone"),
    @NamedQuery(name = "PostForm.findByRoomName", query = "SELECT p FROM PostForm p WHERE p.roomName = :roomName"),
    @NamedQuery(name = "PostForm.findByRoomPrice", query = "SELECT p FROM PostForm p WHERE p.roomPrice = :roomPrice")})
public class PostForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "hostel_name")
    private String hostelName;
    @Size(max = 255)
    @Column(name = "hostel_address")
    private String hostelAddress;
    @Size(max = 20)
    @Column(name = "hostel_phone")
    private String hostelPhone;
    @Size(max = 100)
    @Column(name = "room_name")
    private String roomName;
    @Lob
    @Size(max = 65535)
    @Column(name = "room_description")
    private String roomDescription;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "room_price")
    private Float roomPrice;

    public PostForm() {
    }

    public PostForm(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public String getHostelAddress() {
        return hostelAddress;
    }

    public void setHostelAddress(String hostelAddress) {
        this.hostelAddress = hostelAddress;
    }

    public String getHostelPhone() {
        return hostelPhone;
    }

    public void setHostelPhone(String hostelPhone) {
        this.hostelPhone = hostelPhone;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public Float getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Float roomPrice) {
        this.roomPrice = roomPrice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostForm)) {
            return false;
        }
        PostForm other = (PostForm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ourproject.pojo.PostForm[ id=" + id + " ]";
    }
    
}
