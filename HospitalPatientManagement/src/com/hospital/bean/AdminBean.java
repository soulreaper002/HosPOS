package com.hospital.bean;

public class AdminBean {
	private String receptionistName;
	private String employeeId;
	private String gender;
	private long mobileNo;
	private String email;
	private String userName;
	private String password;
	public String getReceptionistName() {
		return receptionistName;
	}
	public void setReceptionistName(String receptionistName) {
		this.receptionistName = receptionistName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		password = password;
	}
	public AdminBean(String receptionistName, String employeeId, String gender, long mobileNo, String email,
			String userName, String password) {
		
		this.receptionistName = receptionistName;
		this.employeeId = employeeId;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}
	
	

}
