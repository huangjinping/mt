package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entity.Classes;
import com.entity.Student;
import com.entity.Teacher;
import com.mapper.ClassMapper;

@Service
public class ClassesService {

	@Resource
	ClassMapper mapper;
	
	public Classes getClassMapper(int id){
		return mapper.getClass0(id);
	}
	
	
	public Classes getClassesByTeacherId(int te_id){
		return mapper.getClass2(te_id);
	}
	
	public Teacher getTeacher(int tea_id){
		return mapper.getTeacher(tea_id);
	}
	
	
	public  Classes getClass3ById(int  id){
		return mapper.getClass3(id);
	}
	
	
	public List<Student> getAllClass(){
		return mapper.getClassAll();
	}
}
