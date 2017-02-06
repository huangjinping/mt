<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="${path}/image/favicon.ico" type="image/x-icon" />
<title>注册页面</title>


<script type="text/javascript">

function  onRegister() {
}

</script>


<style type="text/css">
		
		.register{
			margin: 10px;
		}
		.inputs {
			padding: 1px;
		}
		.register label{
			display: inline-block;
			width: 65px;
			text-align: right;
		}
		.submitButton{
			display: inline-block;
			width: 306px;
			height: 52px;
			background:#69b946;
			font: 22px/52px "微软雅黑";
			color: #fff;
			border-radius: 3px;
			border-style: solid;
			border-width: 1px;
			border-color: transparent;
		}
		
	/* 	.yuanjiao{
			display: inline-block;
			width: 300px;
			height: 35px;
			border: none;
			background:url(${path}/image/ipt.png);
		}
		
		.yuanjiao input{
			width:284px;
			height:18px;
			padding:8px;
			line-height:14px;
			font-size:18px;
			border: none;
			background: transparent;
		} */
		
		.title{
			width: 400px;
			height: 30px;
			border-bottom: solid 1px #ddd;
		}
		
		.title div{
			height:15px;
			padding: 5px;
			border-left: solid 3px #59AfE4;
			font:"微软雅黑";
			font-size: 18px;;
			text-align: left;
		}
		
	</style>
</head>
<body>
		<center>
		<div class="title">
			<div>注册账号</div>			
		</div>
		<form action="/mt/add" method="post" class="register">
			<div class="inputs">
				<label>昵称</label>
				<div class="yuanjiao">
					<input  name="name" type="text" id="nickname" />	
				</div>
			</div>
			<div class="inputs">
				<label>账号</label>
				<div class="yuanjiao">
					<input type="text" id="account" />
				</div>
			</div>
			<div class="inputs">
				<label>密码</label>
				<div class="yuanjiao">
					<input  name="password" type="password" id="password" />
				</div>
			</div>
			<div class="inputs">
				<label>确认密码</label>
				<div class="yuanjiao">
					<input type="password" id="password2" />
				</div>
			</div>
			<div class="inputs">
				<label> </label><input type="submit" class="submitButton"     onclick="onRegister()"  value="立即注册"/>
			</div>
		</form>
		</center>
	</body>
</html>