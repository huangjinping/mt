package com.mapper;

import com.entity.QQ;

public interface UserMapper {
	
	public String getUser();
	
	public void add(QQ qq);
	
	public QQ  getCurrentUser(String password);
	
}
