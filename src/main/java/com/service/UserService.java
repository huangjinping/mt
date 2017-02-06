package com.service;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.entity.QQ;
import com.mapper.UserMapper;

@Service
public class UserService {

	@Resource
	private UserMapper userMapper;
	
	
	public void test(){
		
		System.out.println(userMapper.getUser());
	}
	
	
	public void addQQ(QQ qq){
		userMapper.add(qq);
	}
	
	
	public QQ  getCurrentUser(String name){		
		QQ currentUser = userMapper.getCurrentUser("wo123456");
		System.out.println("====="+currentUser.toString());
		
		return currentUser;
	}
}
