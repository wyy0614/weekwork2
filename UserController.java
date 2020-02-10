package com.itdr.controller;

import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserService userService;


    public ModelAndView login(String username,String password){
        ModelAndView m = new ModelAndView();
        String s = userService.selectByUsernameAndPassword(username, password);
        m.addObject("s",s);
        m.setViewName("index");
        return m;
    }

    @RequestMapping("getall.do")
    public ModelAndView getAll(){
        ModelAndView m = new ModelAndView();
        List<Users> li = userService.getAll();
        m.addObject("li",li);
        m.setViewName("home");
        return m;
    }

    @RequestMapping("add.do")
    public ModelAndView addOne(String username, Date birthday){
        ModelAndView m = new ModelAndView();
        int i  = userService.addOne("wasd",birthday);
        m.addObject("i",i);
        m.setViewName("add");
        return m;
    }

    @RequestMapping("huishou.do")
    //将好友放入回收站
    public ModelAndView huishou(String username){
        ModelAndView m = new ModelAndView();
        int i = userService.inputHui(username);
        m.addObject("i",i);
        m.setViewName("huishouzhan");
        return m;
    }

    @RequestMapping("getallhui.do")
    public ModelAndView getAllHui(){
        ModelAndView m = new ModelAndView();
        List<Users> li = userService.selectAllHui();
        m.addObject("li",li);
        m.setViewName("huishouzhan");
        return m;
    }

    //清空回收站
    @RequestMapping("getallhui.do")
    public ModelAndView deleteAll(){
        ModelAndView m = new ModelAndView();
        int i = userService.deleteFriend();
        m.addObject("li",i);
        m.setViewName("huishouzhan");
        return m;
    }
}
