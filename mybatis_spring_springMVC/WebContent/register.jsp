<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>注册的注册</title>
		<style type="text/css">
			body{
			background:url(timg.jpg) no-repeat ;
			}
				*{
				margin: 0;
				padding:0;
				color:#8800ff;
				}
			div{
			padding:20px 30px 30px 60px;
			border:3px dashed #8800ff;
			width:30%;
			margin:200px auto;
			background:#c0c0c0;
			opacity:0.7;
			}
			span{
			font-size:5px;
			color:red;
			}
		</style>
		<script src="js/jquery-1.11.1.js"></script>
		<script type="text/javascript">
		//用户文本框失去焦点时触发
			function f1(){
				//获取用户信息
				var $userValue=$("#user").val();
				console.log($userValue);//测试在浏览器控制台中是否输出用户文本框中的值

				//通过ajax，将用户信息发生后台
				$.ajax({
					url:"register/checkUser.do",
					method:"post",
					data:{"username":$userValue}, //请求参数
					dataType:"json",//数据返回类型
					success:function(data){//ajax接收后端数据成功，并将信息封装到data中
						console.log(data);//测试观察后端返回的数据
						$("#resultUser").text(data.msg);
						},
						error:function(){
							alert("服务器异常！");
							}
					});
				}
		</script>
	</head>
	<body>
		<div >
			<form action="" >
				用  &nbsp;&nbsp;&nbsp;户 &nbsp; &nbsp;&nbsp;名❥ <input type="text" name="username" id="user"  onblur="f1();"/>
						<span id="resultUser"></span>
				<br/>
				密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码❥    <input type="password" name="password"/>
				<br/>
				再次输入密码❥     <input type="password">
				<br/>
					   <input type="submit" value="注册"/>
				
			</form>
		</div>
	</body>
</html>