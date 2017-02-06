package com;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class MyBatisUtil {
	private static SqlSessionFactory sqlSessionFactory;
	private  static Reader   reader;
	
	static{
		try {
			reader=Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
    
    
    public  static SqlSession getSqlSesstion(){
    	if (sqlSessionFactory==null) {
			System.out.println("sqlSessionFactory==null");
		}else{
			System.out.println("sqlSessionFactory=!=null");
		}
	     SqlSession session = sqlSessionFactory.openSession();
		return session;
    }
        
//	public static void main(String[] args) {
//	     SqlSession session = sqlSessionFactory.openSession();
//	        try {
//	        String user = session.selectOne("com.mapper.UserMapper.getUser", 1);
//	        System.out.println(user);
//	        } finally {
//	        session.close();
//	        }
//	}
}
