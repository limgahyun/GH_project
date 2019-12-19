package com.project.gh.Threekingdoms.Wei;

public class WeiVO {

	private int wei_id;
	private String adult_name; //관명
	private String name;  //자
	private String birth_death; // 출생부터 사망까지 날짜
	private String introduce;  //장수소개
	private String life;  //장수 생애
	private String rating_1;  //장수 평가
	private String rating_2;  //장수 평가
	private String rating_3;  //장수 평가
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
	public String getRating_1() {
		return rating_1;
	}
	public void setRating_1(String rating_1) {
		this.rating_1 = rating_1;
	}
	public String getRating_2() {
		return rating_2;
	}
	public void setRating_2(String rating_2) {
		this.rating_2 = rating_2;
	}
	public String getRating_3() {
		return rating_3;
	}
	public void setRating_3(String rating_3) {
		this.rating_3 = rating_3;
	}
	public String getStroy_link() {
		return stroy_link;
	}
	public void setStroy_link(String stroy_link) {
		this.stroy_link = stroy_link;
	}
	
	@Override
	public String toString() {
		return "WeiVO [wei_id=" + wei_id + ", adult_name=" + adult_name + ", name=" + name + ", birth_death="
				+ birth_death + ", introduce=" + introduce + ", life=" + life + ", rating_1=" + rating_1 + ", rating_2="
				+ rating_2 + ", rating_3=" + rating_3 + ", stroy_link=" + stroy_link + ", getWei_id()=" + getWei_id()
				+ ", getAdult_name()=" + getAdult_name() + ", getName()=" + getName() + ", getBirth_death()="
				+ getBirth_death() + ", getIntroduce()=" + getIntroduce() + ", getLife()=" + getLife()
				+ ", getRating_1()=" + getRating_1() + ", getRating_2()=" + getRating_2() + ", getRating_3()="
				+ getRating_3() + ", getStroy_link()=" + getStroy_link() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
