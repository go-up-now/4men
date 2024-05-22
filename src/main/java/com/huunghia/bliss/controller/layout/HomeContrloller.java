package com.huunghia.bliss.controller.layout;

import com.huunghia.bliss.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContrloller {
    @RequestMapping("/trang-chu")
    public String getIndex(){
        return "customers/index";
    }
}
