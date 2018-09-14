package com.example.demo.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class urlController {

    @RequestMapping("/faqs/admin/category")
    public String category(){
        return "/faqs/admin/category";
    }

    @RequestMapping("/faqs/admin/language")
    public String language(){
        return "/faqs/admin/language";
    }

    @RequestMapping("/faqs/admin/detailed")
    public String detailed(){
        return "/faqs/admin/detailed";
    }
}
