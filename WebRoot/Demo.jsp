<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>非模态窗口</title>
<!-- 这是我写的demo，用的网上的样式，你在引入样式的时候换成项目中的bui地址 -->
<link href="../../assets/code/demo.css" rel="stylesheet">
 
  <link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/dpl.css" rel="stylesheet">
  <link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/bui.css" rel="stylesheet">
 
</head>
<body>
  <div class="demo-content">
    <div>
      <button id="btnShow" class="button button-primary">显示</button>
    </div>
	
<!-- 尽量用框架中的样式，这个样式太好看了！大家都丑丑的多好！ --> 
  <script src="http://g.tbcdn.cn/fi/bui/jquery-1.8.1.min.js"></script>
  <script src="http://g.alicdn.com/bui/seajs/2.3.0/sea.js"></script>
  <script src="http://g.alicdn.com/bui/bui/1.1.21/config.js"></script>
 
<!-- script start --> 
    <script type="text/javascript">
        BUI.use('bui/overlay',function(Overlay){
          var dialog = new Overlay.Dialog({
            title:'弹窗',
            width:500,
            height:300,
            mask:false,
            buttons:[
                     {
                text:'确定',
                elCls : 'button button-primary',
                handler : function(){
                  //do something
                  this.close();
                }
              },{
                text:'关闭',
                elCls : 'button',
                handler : function(){
                  this.close();
                }
              }
              ],
            bodyContent:'<p>在这里拼接你的下拉框</p>'
          });
        dialog.show();
        $('#btnShow').on('click',function () {
          dialog.show();
        });
      });
    </script>
<!-- script end -->
  </div>
</body>
</html>