package com.controller;

import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.print.attribute.HashDocAttributeSet;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.QQ;
import com.google.gson.Gson;
import com.service.UserService;

@Controller
public class userController {
	
	@Resource
	private UserService userService;
    
	@RequestMapping("/login")
	public String login() {
		// userService.test();
		return "login";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/add")
	public String addQQ(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String nextElement = headerNames.nextElement();
			System.out.println(nextElement + " :  " + request.getHeader(nextElement));
		}
		System.out.println(request.getHeader("humpJsonStyle") + "==========" + headerNames.toString());
		QQ qq = new QQ();
		qq.setNickname(name);
		qq.setPassword(password);
		userService.addQQ(qq);
		return "register";
	}
    
	@ResponseBody
	@RequestMapping("/getLoginJson")
	public String getTestJson(HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
		Map<String, Object> map = new HashMap<>();
		map.put("code", 0);
		map.put("message", "request success!");
		Map<String, Object> result = new HashMap<>();
		result.put("id", 5);
		result.put("phone", null);
		result.put("bannerUrl", "http://123.56.136.151/hd-merchant-web/mobile/picture/down?file=");
		result.put("token", "1iexr3wql99v6");
		result.put("bussinessId", "460");
		result.put("name", "对啊管理员");
		result.put("createCommFlag", true);
		result.put("createCommFlagFalse", false);
		map.put("result", result);
		Gson gson = new Gson();
		String json = gson.toJson(map);
		try {
			// ServletOutputStream os = response.getOutputStream(); // 获取输出流
			// os.write(json.getBytes(Charset.forName("UTF-8"))); // 将json数据写入流中
			// os.flush();

			// 方案一
			response.setCharacterEncoding("UTF-8"); // 设置编码格式
			response.setContentType("text/html"); // 设置数据格式
//			PrintWriter out = response.getWriter(); // 获取写入对象
//			out.print(json); // 将json数据写入流中
//			out.flush();
			
			ServletOutputStream oute = response.getOutputStream();
			oute.write(json.getBytes());
			response.reset();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}
    
	@ResponseBody
	@RequestMapping("/getCurrent")
	public String getCurrentUser(HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		QQ currentUser = userService.getCurrentUser("wo123456");
		Map<String, Object> map = new HashMap<>();
		Map<String, String> child = new HashMap<>();
		child.put("name", "haha");
		child.put("level", "111");
		map.put("child", child);
		map.put("son", "");
		map.put("isMain", true);
		map.put("mide", false);
		Gson gson = new Gson();
		String json = gson.toJson(map);
		return json;
	}
	
	
	
	
	
	
	
	
	@RequestMapping("/loginUser")
	public String getCurrent(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name + "name" + password + "password");
		QQ currentUser = userService.getCurrentUser(password);
		if (currentUser != null) {
			return "main";
		} else {
			return "login";
		}
	}

	
	
	
}
