package com.controller;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import utils.KeyUtil;

import com.model.XlgpApi;

@Controller
public class XlgpApiController {
	 @RequestMapping(value="/XlgpApi.do")
	    public String find(String gpdm , HttpServletRequest request) throws Exception{
		 	XlgpApi xlgp =new XlgpApi();
		 	String gpxx = getURLContent(gpdm);
		 	/**
			 * 这个字符串由许多数据拼接在一起，不同含义的数据用逗号隔开了，按照程序员的思路，顺序号从0开始。
				0：”大秦铁路”，股票名字；
				1：”27.55″，今日开盘价；
				2：”27.25″，昨日收盘价；
				3：”26.91″，当前价格；
				4：”27.55″，今日最高价；
				5：”26.20″，今日最低价；
				6：”26.91″，竞买价，即“买一”报价；
				7：”26.92″，竞卖价，即“卖一”报价；
				8：”22114263″，成交的股票数，由于股票交易以一百股为基本单位，所以在使用时，通常把该值除以一百；
				9：”589824680″，成交金额，单位为“元”，为了一目了然，通常以“万元”为成交金额的单位，所以通常把该值除以一万；
				10：”4695″，“买一”申请4695股，即47手；
				11：”26.91″，“买一”报价；
				12：”57590″，“买二”
				13：”26.90″，“买二”
				14：”14700″，“买三”
				15：”26.89″，“买三”
				16：”14300″，“买四”
				17：”26.88″，“买四”
				18：”15100″，“买五”
				19：”26.87″，“买五”
				20：”3100″，“卖一”申报3100股，即31手；
				21：”26.92″，“卖一”报价
				(22, 23), (24, 25), (26,27), (28, 29)分别为“卖二”至“卖四的情况”
				30：”2008-01-11″，日期；
				31：”15:05:32″，时间；
			 */
		 	String [] result = gpxx.split(",");
		 	xlgp.setId(KeyUtil.getUuid());
		 	xlgp.setGpmz(result[0].substring(21, result[0].length()));
		 	xlgp.setJrkpl(result[1]);
		 	xlgp.setZrspj(result[2]);
		 	xlgp.setDqjg(result[3]);
		 	xlgp.setJrzgj(result[4]);
		 	xlgp.setJrzdj(result[5]);
		 	xlgp.setJmj_1(result[6]);
		 	xlgp.setJmj_2(result[7]);
		 	xlgp.setCjgps(result[8]);
		 	xlgp.setCjje(result[9]);
		 	xlgp.setM1sqgs_1(result[10]);
		 	xlgp.setM1bj_1(result[11]);
		 	xlgp.setM2sqgs_1(result[12]);
		 	xlgp.setM2bj_1(result[13]);
		 	xlgp.setM3sqgs_1(result[14]);
		 	xlgp.setM3bj_1(result[15]);
		 	xlgp.setM4sqgs_1(result[16]);
		 	xlgp.setM4bj_1(result[17]);
		 	xlgp.setM5sqgs_1(result[18]);
		 	xlgp.setM5bj_1(result[19]);
		 	xlgp.setM1sqgs_2(result[20]);
		 	xlgp.setM1bj_2(result[21]);
		 	xlgp.setM2sqgs_2(result[22]);
		 	xlgp.setM2bj_2(result[23]);
		 	xlgp.setM3sqgs_2(result[24]);
		 	xlgp.setM3bj_2(result[25]);
		 	xlgp.setM4sqgs_2(result[26]);
		 	xlgp.setM4bj_2(result[27]);
		 	xlgp.setM5sqgs_2(result[28]);
		 	xlgp.setM5bj_2(result[29]);
		 	xlgp.setRq(result[30]);
		 	xlgp.setSj(result[31]);
		 	request.setAttribute("xlgp", xlgp);
	        return "XlgpApi/index";
	    }
	 	public static String getURLContent(String gpdm) throws Exception {
			String strURL = "http://hq.sinajs.cn/list=sh"+gpdm;//601988中国银行
			URL url = new URL(strURL);
			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
			httpConn.setRequestMethod("GET");
			httpConn.connect();
	 
			BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "GBK"));
			String line;
			StringBuffer buffer = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			reader.close();
			httpConn.disconnect();
			String gpxx = buffer.toString();
			return gpxx;
		}
}
