package com.itdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index/")
public class IndecController {

    //跳转到新增好友页面
    @RequestMapping("addview.do")
    public String toAddView(){
        return "add";
    }

    //跳转到删除好友页面
    @RequestMapping("deleteview.do")
    public String toDeleteView(){
        return "delete";
    }
    
}
