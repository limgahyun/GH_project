package com.project.gh.Threekingdoms.Wei;

public class FileWeiVO {
	
	private int wei_id;
	private int fileWeiCode;
	private String fileWeiName;
	private String fileWeiExt;
	private String fileWeiType;
	private int fileWeiSize;
	
	public int getWei_id() {
		return wei_id;
	}
	public void setWei_id(int wei_id) {
		this.wei_id = wei_id;
	}
	public int getFileWeiCode() {
		return fileWeiCode;
	}
	public void setFileWeiCode(int fileWeiCode) {
		this.fileWeiCode = fileWeiCode;
	}
	public String getFileWeiName() {
		return fileWeiName;
	}
	public void setFileWeiName(String fileWeiName) {
		this.fileWeiName = fileWeiName;
	}
	public String getFileWeiExt() {
		return fileWeiExt;
	}
	public void setFileWeiExt(String fileWeiExt) {
		this.fileWeiExt = fileWeiExt;
	}
	public String getFileWeiType() {
		return fileWeiType;
	}
	public void setFileWeiType(String fileWeiType) {
		this.fileWeiType = fileWeiType;
	}
	public int getFileWeiSize() {
		return fileWeiSize;
	}
	public void setFileWeiSize(int fileWeiSize) {
		this.fileWeiSize = fileWeiSize;
	}
	
	@Override
	public String toString() {
		return "FileWeiVO [wei_id=" + wei_id + ", fileWeiCode=" + fileWeiCode + ", fileWeiName=" + fileWeiName
				+ ", fileWeiExt=" + fileWeiExt + ", fileWeiType=" + fileWeiType + ", fileWeiSize=" + fileWeiSize + "]";
	}

}
