<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="layui/css/layui.css" media="all">
<title>新浪股票接口</title>
</head>
<body>
	<form action="XlgpApi.do" method="post">
		<div style="width:100%;text-align:center">
			<br><br><br><br><br><br><!-- 我是真的懒 -->
			<div class="layui-input-inline">
				<input type="text" name="gpdm" lay-verify="" autocomplete="off"
					required="required" placeholder="请输入上交股票代码..." class="layui-input"
					value="601988">
			</div>

			<div class="layui-form-item">
				<br>
				<button class="layui-btn">立即提交</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
			</div>
		</div>
	</form>
</body>
</html>
