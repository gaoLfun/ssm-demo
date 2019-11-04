<%@page import="com.model.XlgpApi"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="layui/css/layui.css"  media="all">
<title>股票详情</title>
</head>
<%
XlgpApi xlgp = (XlgpApi)request.getAttribute("xlgp");
%>
<body>
<div class="layui-form">
	<a class="layui-btn layui-btn-normal layui-btn-radius" href="javascript:" onclick="self.location=document.referrer;">返回</a>
    <a class="layui-btn layui-btn-warm layui-btn-radius" href="javascript:location.reload()">刷新</a>
  <table class="layui-table">
    <colgroup>
      <col width="150">
      <col width="150">
      <col width="150">
      <col width="150">
      <col width="150">
      <col width="150">
    </colgroup>
    <tbody>
      <tr>
        <td>股票名称</td>
        <td><%=xlgp.getGpmz() %></td>
        <td>今日开盘价</td>
        <td><%=xlgp.getJrkpl() %></td>
        <td>昨日收盘价</td>
        <td><%=xlgp.getZrspj() %></td>
      </tr>
       <tr>
        <td>当前价格</td>
        <td><%=xlgp.getDqjg() %></td>
        <td>今日最高价</td>
        <td><%=xlgp.getJrzgj() %></td>
        <td>今日最低价</td>
        <td><%=xlgp.getJrzdj() %></td>
      </tr>
      <tr>
        <td>竞买价</td>
        <td><%=xlgp.getJmj_1() %></td>
        <td>竞卖价</td>
        <td><%=xlgp.getJmj_2() %></td>
        <td>成交股票数</td>
        <td><%=xlgp.getCjgps() %></td>
      </tr>
      <tr>
        <td>成交金额</td>
        <td><%=xlgp.getCjje() %></td>
        <td>“买一”申请股数</td>
        <td><%=xlgp.getM1sqgs_1() %></td>
        <td>“买一”报价</td>
        <td><%=xlgp.getM1bj_1() %></td>
      </tr>
      <tr>
        <td>“买二”申请股数</td>
        <td><%=xlgp.getM2sqgs_1() %></td>
        <td>“买二”报价</td>
        <td><%=xlgp.getM2bj_1() %></td>
        <td>“买三”申请股数</td>
        <td><%=xlgp.getM3sqgs_1() %></td>
      </tr>
      <tr>
        <td>“买三”报价</td>
        <td><%=xlgp.getM3bj_1() %></td>
        <td>“买四”申请股数</td>
        <td><%=xlgp.getM4sqgs_1() %></td>
        <td>“买四”报价</td>
        <td><%=xlgp.getM4bj_1() %></td>
      </tr>
      <tr>
        <td>“买五”申请股数</td>
        <td><%=xlgp.getM5sqgs_1() %></td>
        <td>“买五”报价</td>
        <td><%=xlgp.getM5bj_1() %></td>
        <td>“卖一”申请股数</td>
        <td><%=xlgp.getM1sqgs_2() %></td>
      </tr>
      <tr>
        <td>“卖一”报价</td>
        <td><%=xlgp.getM1bj_2() %></td>
        <td>“卖二”申请股数</td>
        <td><%=xlgp.getM2sqgs_2() %></td>
        <td>“卖二”报价</td>
        <td><%=xlgp.getM2bj_2() %></td>
      </tr>
       <tr>
        <td>“卖三”申请股数</td>
        <td><%=xlgp.getM3sqgs_2() %></td>
        <td>“卖三”报价</td>
        <td><%=xlgp.getM3bj_2() %></td>
        <td>“卖四”申请股数</td>
        <td><%=xlgp.getM4sqgs_2() %></td>
      </tr>
      <tr>
        <td>“卖四”报价</td>
        <td><%=xlgp.getM4bj_2() %></td>
        <td>“卖五”申请股数</td>
        <td><%=xlgp.getM5sqgs_2() %></td>
        <td>“卖五”报价</td>
        <td><%=xlgp.getM5bj_2() %></td>
      </tr>
      <tr>
        <td>日期</td>
        <td><%=xlgp.getRq() %></td>
        <td>时间</td>
        <td><%=xlgp.getSj() %></td>
      </tr>
    </tbody>
  </table>
</div>
</body>
</html>
