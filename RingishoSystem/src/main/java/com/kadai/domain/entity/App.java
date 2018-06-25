package com.kadai.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="App")
public class App {
	
	@Id
	@Column(name = "app_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appId;
	
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "department_id")
	private int departmentId;
	
	@Column(name = "division_id")
	private int divisionId;
	
	@Column(name = "price_id")
	private int priceId;
	
	@Column(name = "app_flg")
	private boolean appFlg;
	
	@Column(name = "app_subject")
	private String appSubject;
	
	@Column(name = "app_content")
	private String appContent;
	
	@Column(name = "app_price")
	private int appPrice;
	
	@Column(name = "app_attachment")
	private String appAttachment;
	
	@Column(name = "app_comment")
	private String appComment;
	
	@Column(name = "app_start_date")
	private String appStartDate;
	
	@Column(name = "app_end_date")
	private String appEndDate;
	
	public App() {
	}
	
	public App(int employeeId, int departmentId, int divisionId, int priceId, boolean appFlg, String appSubject, String appContent, int appPrice, String appAttachment, String appComment, String appStartDate, String appEndDate) {
		this();
		this.employeeId = employeeId;
		this.departmentId = departmentId;
		this.divisionId = divisionId;
		this.priceId = priceId;
		this.appFlg = appFlg;
		this.appSubject = appSubject;
		this.appContent = appContent;
		this.appPrice = appPrice;
		this.appAttachment = appAttachment;
		this.appComment = appComment;
		this.appStartDate = appStartDate;
		this.appEndDate = appEndDate;
	}
	
	public int getAppId() {	
		return appId;
	}
	
	public void setAppId(int appId) {	
		this.appId = appId;
	}

	public long getEmployeeId() {
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
	
	public boolean getAppFlg() {	
		return appFlg;
	}
		
	public void setAppFlg(boolean appFlg) {	
		this.appFlg = appFlg;
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

	public String getAppStartDate() {	
		return appStartDate;
	}
	
	public void setAppStartDate(String appStartDate) {	
		this.appStartDate = appStartDate;
	}
	
	public String getAppEndDate() {	
		return appEndDate;
	}	
		
	public void setAppEndDate(String appEndDate) {	
		this.appEndDate = appEndDate;
	}	
	

}