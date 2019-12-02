package com.project.gh.Threekingdoms.Wei;

public class WeiVO {

	private String adult_name; //관명
	private String name;  //자
	private String explicate;  //장수설명
	
	

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
	
	@Override
	public String toString() {
		return "WeiVO [adult_name=" + adult_name + ", name=" + name + ", explicate=" + explicate + "]";
	}
	
	

}
