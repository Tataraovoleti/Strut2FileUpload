/**
 * Copyright @ 2013 Fazal Code
 * All Rights Reserved to Fazal Code
 */
package com.java.struts.fazalcode;
import java.io.File;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author : Tatarao voleti
 * @date   : 15-Nov-2013 3:57:37 PM
 */
public class FileUploadAction extends ActionSupport implements ServletRequestAware{
	
	private static final long serialVersionUID = -7902829510627879663L;
	private File uploadImage;
	private String uploadImageContentType;
	private String uploadImageFileName;

	private HttpServletRequest servletRequest;
	
	public File getUploadImage() {
		return uploadImage;
	}

	public void setUploadImage(File uploadImage) {
		this.uploadImage = uploadImage;
	}

	public String getUploadImageContentType() {
		return uploadImageContentType;
	}

	public void setUploadImageContentType(String uploadImageContentType) {
		this.uploadImageContentType = uploadImageContentType;
	}

	public String getUploadImageFileName() {
		return uploadImageFileName;
	}

	public void setUploadImageFileName(String uploadImageFileName) {
		this.uploadImageFileName = uploadImageFileName;
	}

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;

	}

	public String execute() {
		System.out.println("image name -----"+uploadImageFileName);
		try {
			String serverPath = servletRequest.getRealPath("/");
			System.out.println("Server path:" + serverPath);
			File destFile = new File(serverPath, this.uploadImageFileName);

			FileUtils.copyFile(this.uploadImage,destFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
