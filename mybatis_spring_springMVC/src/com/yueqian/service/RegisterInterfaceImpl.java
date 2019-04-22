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
	RegisterMapper dao;//������������mapper�ӿ�ʵ��������ע�롣
	
	//������ҳҳ����û����Ƿ����
	@Override
	public HandleResult checkUser(String username) {
		HandleResult result = new HandleResult();//��װ������
		if(username == null || "".equals(username)) {
			result.setCode(2);
			result.setMsg("ע����û�������Ϊ��");
			return result;
		}
		
		//����dao��,ͨ���û�����ѯ�û���Ϣ
		TUser user = dao.findUser(username);
		
		//�ж��Ƿ��ܲ�ѯ���û������и��û������ʾע����ˡ����ޣ����ʾ����������û���ע��
		if(user == null) {
			result.setCode(0);
			result.setMsg("���û�δע��Ӵ~");
		}else {
			result.setCode(1);
			result.setMsg("���û��ѱ�ע��");
		}
		return result;
	}

}
