package com.smartlibrary.domain;

public class School extends BaseObject{

	/**
	 * 学校
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String schoolId;
	private String schoolName;
	private String adUrl;
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getAdUrl() {
		return adUrl;
	}
	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}
	
	
}
