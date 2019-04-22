package com.yueqian.service;

import com.yueqian.entity.HandleResult;

//业务层接口
public interface RegisterInterface {
	public HandleResult checkUser(String username);
}
