package com.vplsolutions.fcm.msg.sample.pojo;

import lombok.Data;

import java.util.Map;

@Data
public class Note {
    private String subject;
    public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	private String content;
    private Map<String, String> data;
    private String image;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Map<String, String> getData() {
		return data;
	}
	public void setData(Map<String, String> data) {
		this.data = data;
	}

}
