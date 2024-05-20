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
        return "layout/index";
    }

    @RequestMapping("/ao-so-mi")
    public String getshirt(){
        return "layout/product";
    }

    @RequestMapping("/san-pham-chi-tiet")
    public String getDetailShirt(){
        return "layout/detail-product";
    }

    @RequestMapping("/login")
    public String getLogin(){
        return "layout/login";
    }
    @RequestMapping("/register")
    public String getRegister(){
        return "layout/register";
    }
    @RequestMapping("/forgot-password")
    public String getPassword(){
        return "layout/forgot-password";
    }
    @GetMapping("/cart")
    public String getCart(@ModelAttribute("user") User user){

        return "layout/cart";
    }
}
