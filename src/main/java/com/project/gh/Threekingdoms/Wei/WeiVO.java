package com.project.gh.Threekingdoms.Wei;

public class WeiVO {

	private int wei_id;
	private String adult_name; //관명
	private String name;  //자
	private String name_etc; //묘호 등 기타 이름
	private String birth_death; // 출생부터 사망까지 날짜
	private String introduce;  //장수소개
	private String life;  //장수 생애
	private String rating;  //장수 평가
	private String stroy_link;  //스토리연결
	
	public int getWei_id() {
		return wei_id;
	}
	public void setWei_id(int wei_id) {
		this.wei_id = wei_id;
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
	public String getName_etc() {
		return name_etc;
	}
	public void setName_etc(String name_etc) {
		this.name_etc = name_etc;
	}
	public String getBirth_death() {
		return birth_death;
	}
	public void setBirth_death(String birth_death) {
		this.birth_death = birth_death;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getLife() {
		return life;
	}
	public void setLife(String life) {
		this.life = life;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getStroy_link() {
		return stroy_link;
	}
	public void setStroy_link(String stroy_link) {
		this.stroy_link = stroy_link;
	}
	
	@Override
	public String toString() {
		return "WeiVO [wei_id=" + wei_id + ", adult_name=" + adult_name + ", name=" + name + ", name_etc=" + name_etc
				+ ", birth_death=" + birth_death + ", introduce=" + introduce + ", life=" + life + ", rating=" + rating
				+ ", stroy_link=" + stroy_link + "]";
	}
	
	
	

}
