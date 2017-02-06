package com.mapper;

import java.util.List;

import com.entity.Classes;
import com.entity.Student;
import com.entity.Teacher;

public interface ClassMapper {

	public Classes getClass2(int  tercher_id);
	
	public Classes getClass0(int  id);

	public Teacher getTeacher(int  id);
	
	public Classes getClass3(int id);
	
	public List<Student> getClassAll();
	
}
