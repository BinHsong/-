package com.yueqian.dao;

import com.yueqian.entity.TUser;

/**
 * @author ��D
 * mapper�ӿ�
 */
public interface RegisterMapper {
	public TUser findUser(String username);//���ݿ���е�usernameΨһ,���Բ����Բ�ѯ������¼
}
