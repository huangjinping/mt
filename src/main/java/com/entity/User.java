package com.entity;

import org.springframework.web.multipart.MultipartFile;

public class User {

	private String username;
	private  MultipartFile attachment;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public MultipartFile getAttachment() {
		return attachment;
	}
	public void setAttachment(MultipartFile attachment) {
		this.attachment = attachment;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", attachment=" + attachment + "]";
	}
	
	
}
