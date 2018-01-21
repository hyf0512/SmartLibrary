package com.smartlibrary.domain;

public class Version {
	
	/**
	 * 版本
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String id;
	private String url;
	private String version;
	private String date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
