package com.huunghia.bliss.controller.layout;

import org.springframework.stereotype.Controller;
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
}
