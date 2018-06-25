package com.kadai.app.form;

import javax.validation.constraints.NotEmpty;

public class SessionAppForm {
	
	private int priceId;
	
	@NotEmpty(message="件名は必須です")
	private String appSubject;
	
	@NotEmpty(message="内容は必須です")
	private String appContent;
	
	private int appPrice;
	
	@NotEmpty(message="添付書類は必須です")
	private String appAttachment;
	
	@NotEmpty(message="コメントは必須です")
	private String appComment;
	
	public int getPriceId() {
		return priceId;
	}
	
	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}

	public String getAppSubject() {
		return appSubject;
	}

	public void setAppSubject(String appSubject) {
		this.appSubject = appSubject;
	}

	public String getAppContent() {
		return appContent;
	}

	public void setAppContent(String appContent) {
		this.appContent = appContent;
	}

	public int getAppPrice() {
		return appPrice;
	}

	public void setAppPrice(int appPrice) {
		this.appPrice = appPrice;
	}

	public String getAppAttachment() {
		return appAttachment;
	}

	public void setAppAttachment(String appAttachment) {
		this.appAttachment = appAttachment;
	}

	public String getAppComment() {
		return appComment;
	}

	public void setAppComment(String appComment) {
		this.appComment = appComment;
	}
}
