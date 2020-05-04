package com.comstar.user.controller;

import com.comstar.user.bean.UmsMember;
import com.comstar.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Asus
 * Date: 2020-05-04
 * Time: 11:46
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody  //把字符串转成json
    public String hello(){
        return "hello world";
    }

    // 测试查询所有
    @GetMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMemberList =userService.getAllUser();
        return umsMemberList;
    }
}
