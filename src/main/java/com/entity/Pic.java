package com.entity;

import javax.persistence.Entity;

@Entity
public class Pic {
	private float id;
	private  String path;
	private  String url;
	private  String name;
	public float getId() {
		return id;
	}
	public void setId(float id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
	
}
