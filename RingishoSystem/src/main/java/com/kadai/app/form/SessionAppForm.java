package com.kadai.app.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class SessionAppForm {
	
	private int employeeId;
	private int departmentId;
	private int divisionId;
	
	@NotEmpty(message="件名は必須です")
	private String appSubject;
	
	@NotEmpty(message="内容は必須です")
	private String appContent;
	
	@NotEmpty(message="申請金額は必須です")
	@Pattern(regexp="[0-9]*", message="数字で入力してください")
	@Min(value=1, message="{value}以上で入力してください")
	private String appPrice;
	
	@NotEmpty(message="添付書類は必須です")
	private String appAttachment;
	
	private String appComment;
	
	/**
	 * Getter Setter
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(int divisionId) {
		this.divisionId = divisionId;
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

	public String getAppPrice() {
		return appPrice;
	}

	public void setAppPrice(String appPrice) {
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
