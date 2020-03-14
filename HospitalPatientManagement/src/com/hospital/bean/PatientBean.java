package com.hospital.bean;

import java.time.LocalDate;
public class PatientBean {
private String firstName;
private String middleName;
private String lastName;
private String gender;
private int age;
private String email;
private long phoneNumber;
private String address;
private long pinCode;
private String state;
private String country;
private LocalDate admitDate;
private int wardId;
public PatientBean(String firstName, String middleName, String lastName, String gender, int age, String email,
		long phoneNumber, String address, long pinCode, String state, String country, LocalDate admitDate, int wardId) {
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.gender = gender;
	this.age = age;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.pinCode = pinCode;
	this.state = state;
	this.country = country;
	this.admitDate = admitDate;
	this.wardId = wardId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPinCode() {
	return pinCode;
}
public void setPinCode(long pinCode) {
	this.pinCode = pinCode;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public LocalDate getAdmitDate() {
	return admitDate;
}
public void setAdmitDate(LocalDate admitDate) {
	this.admitDate = admitDate;
}
public int getWardId() {
	return wardId;
}
public void setWardId(int wardId) {
	this.wardId = wardId;
}
@Override
public String toString() {
	return "PatientBean [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", gender="
			+ gender + ", age=" + age + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address
			+ ", pinCode=" + pinCode + ", state=" + state + ", country=" + country + ", admitDate=" + admitDate
			+ ", wardId=" + wardId + "]";
}
public PatientBean() {
	
}


}
