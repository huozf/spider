package com.zf.spider;

public class DataItem {
	
	private String src;
	
	private String title;
	
	
	public DataItem(){}


	public DataItem(String src, String title) {
		super();
		this.src = src;
		this.title = title;
	}


	public String getSrc() {
		return src;
	}


	public void setSrc(String src) {
		this.src = src;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "DataItem [src=" + src + ", title=" + title + "]";
	}

	
	
	
	

}
