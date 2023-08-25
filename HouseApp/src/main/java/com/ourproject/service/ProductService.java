/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ourproject.service;

import com.ourproject.pojo.User;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ahjhj
 */
public interface ProductService {
    List<User> getProducts(Map<String, String > params );
    int countProduct();
}
