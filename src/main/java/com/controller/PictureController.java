package com.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.entity.Classes;
import com.entity.Pic;
import com.entity.User;
import com.service.ClassesService;
import com.service.PicService;



/**
 * 图片控制器
 * @author harrishuang
 *
 */
@Controller
public class PictureController {

	@Resource
	 PicService service;
	 @Resource
	 ClassesService classesService;
	 
	 
	 @RequestMapping("addClasses")
	 public String add(){
		 return "classes_select";
	 }
	 
	 
	 
	 
	 @RequestMapping("classes_List")
	 @ResponseBody
	 public  String class_list(){
		 return classesService.getAllClass().toString();
	 }
	 
	 
	 
	 
	 
	 
	 
	
	@RequestMapping("index")
    public String index(){
    	return "index";
    }
	
	
	@ResponseBody
	@RequestMapping("getclass")
	public String  getclasses(){
//		for (int i = 1; i < 5; i++) {
//			System.out.println(	classesService.getClassMapper(i));
//		}
//		for (int i = 1; i < 5; i++) {
//			System.out.println(	classesService.getTeacher(i));
//		}
		
		System.out.println(classesService.getClass3ById(1));
		
		return "1";
	}  
	
     /**
      * 增加图片信息接口
      * @param request
      * @param response
      */
//	====================multipart/form-data; boundary=----WebKitFormBoundaryTqca1G6Av7qhhTlK

//	,MultipartFile[] files
//	@RequestParam() 
	@ResponseBody
	@RequestMapping("/addpic")
	 public String addPic(User user){
		MultipartFile attachment = user.getAttachment();
		try {
			byte[] bytes = attachment.getBytes();
			String contentType = attachment.getContentType();
//			InputStream inputStream = attachment.getInputStream();
			Pic pic=new Pic();
			pic.setName("namecontentType");
			pic.setPath(""+bytes.length);
			pic.setUrl(""+"33");
			Random random=new Random();
			pic.setId(random.nextInt(10000));
			service.addPic(pic);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return user.toString();
//		DiskFileItemFactory factory = new DiskFileItemFactory();
//		ServletFileUpload upload = new ServletFileUpload(factory);
////		List<FileItem> parseRequest = upload.parseRequest(request);
//		List<FileItem> items;
//		try {
//		items = upload.parseRequest(request);//参数是HttpServletRequest对象
//		for (FileItem item : items){//遍历所有客户端提交的参数(包括文件域)
//		if(item.isFormField()){
//		String key=item.getFieldName();
//		String value=item.getString();
//	       System.out.println(key+"====================>>>>>>>>>>>>>>"+value);
//		}else{
//		String key = item.getFieldName();//取出文件域的键
//	       System.out.println(key+"===================key=>>>>>>>>>>>>>>");
//
//		       String value = item.getName();//取出文件域的值
//		       long fileLen = item.getSize();//取出上传文件的尺寸
//		       
//		       System.out.println(value+"====================>>>>>>>>>>>>>>"+fileLen);
//		       
////		       String mimeType = item.getContentType();//取出上传文件的类型
////		       File f=new File("E:\\test\\");//文件地址（上传后服务器硬盘地址）
////		       f.mkdirs();
////		       item.write(new File(f+"\\"+value));//保存上传的文件到服务器本地
////		       String dizhi=f+"\\"+value;
////		     // boolean fag= excelaction.ExcelIinput(f+"\\"+value);
////		     response.sendRedirect("/g-ecis/excelout.do?method=ExcelIinput&dizhi="+dizhi);//这里是重新向（指定业务需求，其他人可以忽略删除）
//
//		}
//		}
//		} catch (FileUploadException e) {
//			
//			System.out.println("FileUploadException"+e.getMessage());
//				e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println("Exception"+e.getMessage());
//		e.printStackTrace();
//		}
		
		 
	 }
}
