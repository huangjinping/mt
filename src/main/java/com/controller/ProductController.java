package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

	@ResponseBody
	@RequestMapping("/getProductList")
	public String  getProductList(){
	List<String> list=new ArrayList<>();
		 for (int i = 0; i < 100; i++) {
			 list.add("=====>>"+i);
		}
		return list.toString();
	}
	@RequestMapping("/addProduct")
	public  String  addProduct(HttpServletRequest request, HttpServletResponse response){
		return null;	
	}	
}
