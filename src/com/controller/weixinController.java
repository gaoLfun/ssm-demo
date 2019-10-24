package com.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jettison.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import utils.SignUtil;


@Controller
public class weixinController {
		@ResponseBody
	    @RequestMapping(value="/getToken.do")
	    public void getToken(HttpServletRequest request, HttpServletResponse response) throws JSONException, IOException{
			System.out.println("========WechatController========= ");
			String signature = request.getParameter("signature");/// 微信加密签名
			String timestamp = request.getParameter("timestamp");/// 时间戳
			String nonce = request.getParameter("nonce"); /// 随机数
			String echostr = request.getParameter("echostr"); // 随机字符串
			PrintWriter out = response.getWriter();
	 
			if (SignUtil.checkSignature(signature, timestamp, nonce)) {
				out.print(echostr);
			}
			out.close();
			out = null;
	    }
}
