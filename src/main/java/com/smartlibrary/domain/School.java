package com.smartlibrary.domain;

public class School extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	private String school_id;
	private String name;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSchool_id(String school_id){
		this.school_id=school_id;
	}
	public String getSchool_id(){
		return school_id;
	}

}
