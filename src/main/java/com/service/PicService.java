package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entity.Pic;
import com.mapper.PictureMapper;

@Service
public class PicService {

	
	@Resource
	PictureMapper pictureMapper;
	public void  addPic(Pic pic){
		pictureMapper.addPic(pic);
	}
}
