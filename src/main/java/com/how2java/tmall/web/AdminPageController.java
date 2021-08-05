package com.how2java.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
* 因为是做前后端分离，所以数据是通过 RESTFUL接口来取的，
* 而在业务上，除了 RESTFUL 服务要提供，还要提供页面跳转服务，
* 所以所有的后台页面跳转都放在 AdminPageController 这个控制器里。
* */
@Controller
public class AdminPageController {
    @GetMapping(value="/admin")
    public String admin(){
        return "redirect:admin_category_list";
    }

    @GetMapping(value="/admin_category_list")
    public String listCategory(){
        return  "admin/listCategory";
    }

    @GetMapping(value="/admin_category_edit")
    public String editCategory(){
        return "admin/editCategory";

    }

}
