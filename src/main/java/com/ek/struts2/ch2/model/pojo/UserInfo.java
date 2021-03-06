package com.ek.struts2.ch2.model.pojo;
// Generated 2017-7-4 16:56:54 by Hibernate Tools 3.5.0.Final

import java.util.Date;

/**
 * UserInfo generated by hbm2java
 */
public class UserInfo implements java.io.Serializable {

	private Integer uuid;
	private String username;
	private String sex;
	private Date birthday;
	private byte[] photo1;
	private byte[] photo2;
	private byte[] photo3;

	public UserInfo() {
	}

	public UserInfo(String username, String sex, Date birthday, byte[] photo1, byte[] photo2, byte[] photo3) {
		this.username = username;
		this.sex = sex;
		this.birthday = birthday;
		this.photo1 = photo1;
		this.photo2 = photo2;
		this.photo3 = photo3;
	}

	public Integer getUuid() {
		return this.uuid;
	}

	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public byte[] getPhoto1() {
		return this.photo1;
	}

	public void setPhoto1(byte[] photo1) {
		this.photo1 = photo1;
	}

	public byte[] getPhoto2() {
		return this.photo2;
	}

	public void setPhoto2(byte[] photo2) {
		this.photo2 = photo2;
	}

	public byte[] getPhoto3() {
		return this.photo3;
	}

	public void setPhoto3(byte[] photo3) {
		this.photo3 = photo3;
	}

}
