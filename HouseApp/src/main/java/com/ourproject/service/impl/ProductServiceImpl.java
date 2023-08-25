///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.ourproject.service.impl;
//
//import com.ourproject.pojo.Product;
//import com.ourproject.repository.ProductRepository;
//import com.ourproject.service.ProductService;
//import java.util.List;
//import java.util.Map;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// *
// * @author ahjhj
// */
//@Service
//@Transactional
//public class ProductServiceImpl implements ProductService {
//
//    @Autowired
//    private ProductRepository productRepo;
//
//    @Override
//    public List<Product> getProducts(Map<String, String> params) {
//        return this.productRepo.getProducts(params);
//    }
//
//    @Override
//    public int countProduct() {
//        return this.productRepo.countProduct();
//    }
//
//}
