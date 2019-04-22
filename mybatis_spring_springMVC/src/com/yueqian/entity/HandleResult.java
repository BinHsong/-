package com.yueqian.entity;

/**
 * @author 氷咲
 *将判断用户是否注册的结果封装在这个对象中
 */
public  class HandleResult {
	private int code;//0--不存在 1--存在 2--异常
	private String msg;//处理结果信息
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
