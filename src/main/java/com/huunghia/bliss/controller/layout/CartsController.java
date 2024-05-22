package com.huunghia.bliss.controller.layout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartsController {
    @RequestMapping("/gio-hang")
    public String getcartInfor(){
        return "customers/carts/cart";
    }
}
