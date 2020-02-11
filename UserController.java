package com.itdr.controller;

import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserService userService;

    //用户登陆
    @RequestMapping("login.do")
    public ModelAndView login(String username,String password,HttpSession httpSession){
        Users u = userService.login(username, password);
        httpSession.setAttribute("user",u);
        return cc();
    }
    //查看好友
    @RequestMapping("getall.do")
    public ModelAndView getAll(){
        ModelAndView m = new ModelAndView();
        List<Users> li = userService.getAll();
        m.addObject("li",li);
        m.setViewName("list");
        return m;
    }
    //新增好友
    @RequestMapping("add.do")
    public ModelAndView addOne(String username, Date birthday){
        ModelAndView m = new ModelAndView();
        int i  = userService.addOne(username,birthday);
        m.addObject("i",i);
        m.setViewName("add");
        return m;
    }

    @RequestMapping("huishou.do")
    //将好友放入回收站
    public ModelAndView huishou(String username){
        ModelAndView m = new ModelAndView();
        int i = userService.inputHui(username);
        m.addObject("li",i);
        m.setViewName("huizhouzhan");
        return m;
    }

    @RequestMapping("getallhui.do")
    public ModelAndView getAllHui(){
        ModelAndView m = new ModelAndView();
        List<Users> li = userService.selectAllHui();
        m.addObject("li",li);
        m.setViewName("huizhouzhan");
        return m;
    }

    //清空回收站
    @RequestMapping("deleteallhui.do")
    public ModelAndView deleteAll(){
        ModelAndView m = new ModelAndView();
        int i = userService.deleteFriend();
        m.addObject("li",i);
        m.setViewName("huizhouzhan");
        return m;
    }
    //生日提醒
    @RequestMapping("cc.do")
    public ModelAndView cc(){
        ModelAndView m = new ModelAndView();
        List<Users> i  = userService.cc();
        m.addObject("li",i);
        m.setViewName("home");
        return m;
    }
}
