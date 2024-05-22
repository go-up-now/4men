package com.huunghia.bliss.controller.layout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductsController {
    @RequestMapping("/san-pham")
    public String getProduct(){
        return "customers/products/product";
    }

    @RequestMapping("/san-pham-chi-tiet")
    public String getProductDetail(){
        return "customers/products/detail-product";
    }
}
