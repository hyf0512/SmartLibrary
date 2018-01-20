package com.smartlibrary.domain;

public class Ident extends BaseObject{

	/**
	 * 身份
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String identid;
	private String account;
	private String szLogonName;
	private String schoolName;
	private String studentid;
	private String trueName;
	private String collegeName;
	private String majorName;
	private String sex;
	private String ident;
	private String enrolYear;
	private String schoolCode;
	
	public String getSzLogonName() {
		return szLogonName;
	}
	public void setSzLogonName(String szLogonName) {
		this.szLogonName = szLogonName;
	}

	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdent() {
		return ident;
	}
	public void setIdent(String ident) {
		this.ident = ident;
	}
	public String getEnrolYear() {
		return enrolYear;
	}
	public void setEnrolYear(String enrolYear) {
		this.enrolYear = enrolYear;
	}	
	public String getIdentid() {
		return identid;
	}
	public void setIdentid(String identid) {
		this.identid = identid;
	}

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	
}
