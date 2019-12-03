package com.project.gh.Threekingdoms.Wei;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class WeiRequest {
	
	private String adult_name; //관명
	private String name;  //자
	private String explicate;  //장수설명
	private List<MultipartFile> multipartfile;
	
	public String getAdult_name() {
		return adult_name;
	}
	public void setAdult_name(String adult_name) {
		this.adult_name = adult_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExplicate() {
		return explicate;
	}
	public void setExplicate(String explicate) {
		this.explicate = explicate;
	}
	public List<MultipartFile> getMultipartfile() {
		return multipartfile;
	}
	public void setMultipartfile(List<MultipartFile> multipartfile) {
		this.multipartfile = multipartfile;
	}
	
	@Override
	public String toString() {
		return "FileWeiRequest [adult_name=" + adult_name + ", name=" + name + ", explicate=" + explicate
				+ ", multipartfile=" + multipartfile + "]";
	}
	
}
