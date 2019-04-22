package com.yueqian.entity;

public class TUser {
    private Short userid;

    private String username;

    private String userpassword;

    private String remark;

    public Short getUserid() {
        return userid;
    }

    public void setUserid(Short userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	@Override
	public String toString() {
		return "TUser [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword + ", remark="
				+ remark + "]";
	}
    
}