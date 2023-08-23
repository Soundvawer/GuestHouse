package com.ourproject.controllers;

import com.ourproject.service.CategoryService;
import com.ourproject.service.ProductService;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 *
 */
/**
 *
 * @author ahjhj
 */
@Controller
@ControllerAdvice
@PropertySource("classpath:databases.properties")
public class IndexController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService cateService;

    @RequestMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params) {
        model.addAttribute("categories",this.cateService.getCates());
        model.addAttribute("products", this.productService.getProducts(params));
        return "index";
    }
}
