package com.yueqian.entity;

/**
 * @author ��D
 *���ж��û��Ƿ�ע��Ľ����װ�����������
 */
public  class HandleResult {
	private int code;//0--������ 1--���� 2--�쳣
	private String msg;//��������Ϣ
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "HandleResult [code=" + code + ", msg=" + msg + "]";
	}
	
}
