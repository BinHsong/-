package com.yueqian.dao;

import com.yueqian.entity.TUser;

/**
 * @author 氷咲
 * mapper接口
 */
public interface RegisterMapper {
	public TUser findUser(String username);//数据库表中的username唯一,所以不可以查询多条记录
}
