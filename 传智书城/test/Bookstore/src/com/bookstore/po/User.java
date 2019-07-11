package com.bookstore.po;

/**
 * 鐢ㄦ埛妯″潡瀹炰綋绫� 
 * @author qdmmy6
 *
 */
/*
 * 灞炴�у摢閲屾潵
 * 1. t_user琛細鍥犱负鎴戜滑闇�瑕佹妸t_user琛ㄦ煡璇㈠嚭鐨勬暟鎹皝瑁呭埌User瀵硅薄涓�
 * 2. 璇ユā鍧楁墍鏈夎〃鍗曪細鍥犱负鎴戜滑闇�瑕佹妸琛ㄥ崟鏁版嵁灏佽鍒癠ser瀵硅薄涓�
 */
public class User {
	// 瀵瑰簲鏁版嵁搴撹〃
	private String uid;//涓婚敭
	private String loginname;//鐧诲綍鍚�
	private String loginpass;//鐧诲綍瀵嗙爜
	private String email;//閭
	private boolean status;//鐘舵�侊紝true琛ㄧず宸叉縺娲伙紝鎴栬�呮湭婵�娲�
	private String activationCode;//婵�娲荤爜锛屽畠鏄敮涓�鍊硷紒鍗虫瘡涓敤鎴风殑婵�娲荤爜鏄笉鍚岀殑锛�
	
	// 娉ㄥ唽琛ㄥ崟
	private String reloginpass;//纭瀵嗙爜
	private String verifyCode;//楠岃瘉鐮�
	
	// 淇敼瀵嗙爜琛ㄥ崟
	private String newpass;//鏂板瘑鐮�

	
	public User() {
		super();
	}
	public User(String loginname, String loginpass, String email, String reloginpass, String verifyCode) {
		super();
		this.loginname = loginname;
		this.loginpass = loginpass;
		this.email = email;
		this.reloginpass = reloginpass;
		this.verifyCode = verifyCode;
	}
	public String getReloginpass() {
		return reloginpass;
	}
	public void setReloginpass(String reloginpass) {
		this.reloginpass = reloginpass;
	}
	public String getVerifyCode() {
		return verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}


	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getLoginpass() {
		return loginpass;
	}
	public void setLoginpass(String loginpass) {
		this.loginpass = loginpass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getActivationCode() {
		return activationCode;
	}
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}
	public String getNewpass() {
		return newpass;
	}
	public void setNewpass(String newpass) {
		this.newpass = newpass;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", loginname=" + loginname + ", loginpass="
				+ loginpass + ", email=" + email + ", status=" + status
				+ ", activationCode=" + activationCode + ", reloginpass="
				+ reloginpass + ", verifyCode=" + verifyCode + ", newpass="
				+ newpass + "]";
	}
}