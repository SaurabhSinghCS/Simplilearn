package org.simplilearn.workshop.model;

public class FileUploadResponse {

	private String firstName;
	private String contentType;
	private String url;
	public FileUploadResponse(String firstName, String contentType, String url) {
		super();
		this.firstName = firstName;
		this.contentType = contentType;
		this.url = url;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
