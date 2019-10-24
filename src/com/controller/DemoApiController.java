package com.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoApiController {
	 @RequestMapping(value="/Demo.do")
	    public String demo(){
			return "Demo";
	 }
}
