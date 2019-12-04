package com.project.gh.Threekingdoms.Chu;

public class ChuVO {

	private int chu_id;
	private String adult_name; //관명
	private String name;  //자
	private String explicate;  //장수설명
	
	public int getChu_id() {
		return chu_id;
	}
	public void setChu_id(int chu_id) {
		this.chu_id = chu_id;
	}
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
		return "WeiVO [chu_id=" + chu_id + ", adult_name=" + adult_name + ", name=" + name + ", explicate=" + explicate
				+ "]";
	}

}
