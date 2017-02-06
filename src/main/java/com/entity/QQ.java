package com.entity;

import javax.persistence.Entity;

@Entity
public class QQ {
	
	private Integer id;
	
	private Long account;
	
	private String password;
	
	private String nickname;
	
	private Integer level;
	
	private LOL lol;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public LOL getLol() {
		return lol;
	}

	public void setLol(LOL lol) {
		this.lol = lol;
	}

	public Long getAccount() {
		return account;
	}

	public void setAccount(Long account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "QQ [id=" + id + ", account=" + account + ", password=" + password + ", nickname=" + nickname
				+ ", level=" + level + ", lol=" + lol + "]";
	}
	
	
}