package com.yueqian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yueqian.dao.RegisterMapper;
import com.yueqian.entity.HandleResult;
import com.yueqian.entity.TUser;
@Service
public class RegisterInterfaceImpl implements RegisterInterface{
	@Autowired
	//@Qualifier("registerMapper")
	RegisterMapper dao;//在容器中生产mapper接口实例，依赖注入。
	
	//检验主页页面的用户名是否可用
	@Override
	public HandleResult checkUser(String username) {
		HandleResult result = new HandleResult();//封装处理结果
		if(username == null || "".equals(username)) {
			result.setCode(2);
			result.setMsg("注册的用户名不能为空");
			return result;
		}
		
		//调用dao层,通过用户名查询用户信息
		TUser user = dao.findUser(username);
		
		//判断是否能查询出用户，若有该用户，则表示注册过了。若无，则表示可以用这个用户名注册
		if(user == null) {
			result.setCode(0);
			result.setMsg("该用户未注册哟~");
		}else {
			result.setCode(1);
			result.setMsg("该用户已被注册");
		}
		return result;
	}

}
