package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.user.UserService;

@Controller
public class UserController {
	 @Autowired
	    private UserService userService;

	    @RequestMapping(value="/hello.do")
	    public String find(HttpServletRequest request)
	    {
	        String age=userService.findAge("1");
	        System.out.println(age);//如果实验成功，在控制台会打印年龄1
	        return "index";
	    }
}
