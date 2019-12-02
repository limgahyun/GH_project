package com.project.gh.Threekingdoms.Wei;

import java.util.Date;

public class WeiFile {

	private int weiFileCode;
	private int wei_id;
	private String weiFileName;
	private String weiFileType;
	private String weiFileExt;
	private int weiFileSize;
	private Date dateUploadFile;
	
	
	public int getWeiFileCode() {
		return weiFileCode;
	}
	public void setWeiFileCode(int weiFileCode) {
		this.weiFileCode = weiFileCode;
	}
	public int getWei_id() {
		return wei_id;
	}
	public void setWei_id(int wei_id) {
		this.wei_id = wei_id;
	}
	public String getWeiFileName() {
		return weiFileName;
	}
	public void setWeiFileName(String weiFileName) {
		this.weiFileName = weiFileName;
	}
	public String getWeiFileType() {
		return weiFileType;
	}
	public void setWeiFileType(String weiFileType) {
		this.weiFileType = weiFileType;
	}
	public String getWeiFileExt() {
		return weiFileExt;
	}
	public void setWeiFileExt(String weiFileExt) {
		this.weiFileExt = weiFileExt;
	}
	public int getWeiFileSize() {
		return weiFileSize;
	}
	public void setWeiFileSize(int weiFileSize) {
		this.weiFileSize = weiFileSize;
	}
	public Date getDateUploadFile() {
		return dateUploadFile;
	}
	public void setDateUploadFile(Date dateUploadFile) {
		this.dateUploadFile = dateUploadFile;
	}


	@Override
	public String toString() {
		return "WeiFile [weiFileCode=" + weiFileCode + ", wei_id=" + wei_id + ", weiFileName=" + weiFileName
				+ ", weiFileType=" + weiFileType + ", weiFileExt=" + weiFileExt + ", weiFileSize=" + weiFileSize
				+ ", dateUploadFile=" + dateUploadFile + "]";
	}
	
}
