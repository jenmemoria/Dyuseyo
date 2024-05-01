package com.itbank.model;

import org.springframework.web.multipart.MultipartFile;

//이름        널?       유형            
//--------- -------- ------------- 
//IDX       NOT NULL NUMBER        
//REPORTER  NOT NULL VARCHAR2(100) 
//TARGET    NOT NULL VARCHAR2(100) 
//CONTENT   NOT NULL VARCHAR2(500) 
//PROCESSED          NUMBER  

public class ReportDTO {

	private int idx;
	private String reporter;
	private String target;
	private String content;
	private String img;
	private int processed;
	
	private MultipartFile upload;
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public MultipartFile getUpload() {
		return upload;
	}
	public void setUpload(MultipartFile upload) {
		this.upload = upload;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getProcessed() {
		return processed;
	}
	public void setProcessed(int processed) {
		this.processed = processed;
	}
	
}
