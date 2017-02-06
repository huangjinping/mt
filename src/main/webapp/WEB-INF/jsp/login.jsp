<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 主要 登录界面  -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="${path}/image/favicon.ico" type="image/x-icon" />
<title>qq登录界面</title>
</head>
	<style type="text/css">
		a{
			text-decoration:none;
			font-size: 12px;
			font-family: "微软雅黑";
			color: #0e87b7;
		}
		
		.jizhu label{
			font-size: 12px;
			font-family: "微软雅黑";
			cursor: pointer;
		}
		.biankuang{
			-webkit-box-shadow: #666 0px 0px 10px;
		}
	</style>
	<script type="text/javascript">
		function login(){
			$("#loginForm").submit();
		}
	</script>
	<body >
		<center style="margin-top: 120px;">
			<div style="width: 430px;height: 330px;" class="biankuang" >
			<!--展示logo-->
			<img  src="${path}/image/logo.png"/>
			<!--登录的表单-->
			<div style="margin-top: 10px;">
				<!--头像-->
				<div style="width:80px;height:80px; border: 1px solid #c7c4c4;margin-left: 44px; float: left;">
					<img src="${path}/image/head.png" />
				</div>
				<!-- 表单-->
				<div style="float: left;margin-left:10px;">
					<form action="/mt/add" method="post"  id="loginForm">
						<div>
							<input type="text" name="name" id="useraccount" placeholder="QQ号码/手机/邮箱"  style="width: 193px;height: 25px;" />&nbsp;<a href="${path}/register">注册账号</a>
						</div>
						<div style="margin-top:2px;">
							<input type="password" name="password" id="userpassword" placeholder="密码"  style="width: 193px;height: 25px;" />&nbsp;<a href="xiugai.jsp">找回密码</a><br>
						</div>
						<div style="padding: 0px;text-align: left;" class="jizhu">
							<input type="checkbox" id="remenberPwd" /> <label for="remenberPwd">记住密码</label>
							<input type="checkbox" id="autoLogin" /> <label for="autoLogin">自动登录</label>
						</div>	
						<!--登录按钮-->
						<div style="margin-top: 10px;padding: 0px;    text-align: left;">
							<img src="${path}/image/login.png" style="width: 195px;height: 30px; cursor: pointer;"  onclick="login()"/>
						</div>
					</form>
				</div>
			</div>
			</div>
		</center>
		
	</body>
</html>