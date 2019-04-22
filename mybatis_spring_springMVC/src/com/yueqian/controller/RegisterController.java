package com.yueqian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yueqian.entity.HandleResult;
import com.yueqian.service.RegisterInterface;

@Controller
@RequestMapping("/regis ter")
public class RegisterController {
	
	@Autowired
	//@Qualifier("registerInterfaceImpl")
	RegisterInterface service;
	
	//获取用户名，并调用模型层，查询用户是否注册
	@RequestMapping("/checkUser.do")
	@ResponseBody//将结果以json格式返回给前端
	public HandleResult checkUserName(String username) {
		System.out.println("用户名"+"❥(^_-)"+username);
		//调用模拟层  service层
		HandleResult result=service.checkUser(username);
		
		return result;//
	}

}
