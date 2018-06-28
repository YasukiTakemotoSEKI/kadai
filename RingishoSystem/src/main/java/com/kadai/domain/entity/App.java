package com.kadai.domain.entity;

import java.lang.reflect.Field;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="App")
public class App {
	
	@Id
	@Column(name = "app_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appId=0;
	
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "department_id")
	private int departmentId;
	
	@Column(name = "division_id")
	private int divisionId;
	
	@Column(name = "price_id")
	private int priceId;
	
	@Column(name = "app_status")
	private String appStatus;
	
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
	
	//承認状況一覧で却下者格納で使用
	@Transient
	private String appApprovalName;
	
	//テーブル結合
	@OneToMany
	@JoinColumn(name="app_id", insertable=false, updatable=false)
	private List<Appflow> appflow;
	
	@ManyToOne
	@JoinColumn(name="employee_id", insertable=false, updatable=false)
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name="department_id", insertable=false, updatable=false)
	private Department department;
	
	@ManyToOne
	@JoinColumn(name="division_id", insertable=false, updatable=false)
	private Division division;
	
	@ManyToOne
	@JoinColumn(name="price_id", insertable=false, updatable=false)
	private Price price;
	
	public App() {
	}
	
	public App(int employeeId, int departmentId, int divisionId, int priceId, String appStatus, String appSubject, String appContent, int appPrice, String appAttachment, String appComment, String appStartDate, String appEndDate) {
		this();
//		this.appId = appId;
		this.employeeId = employeeId;
		this.departmentId = departmentId;
		this.divisionId = divisionId;
		this.priceId = priceId;
		this.appStatus = appStatus;
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
	
	public int getPriceId() {
		return priceId;
	}
	
	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}
	
	public int getDivisionId() {
		return divisionId;
	}
	
	public void setDivisionId(int divisionId) {
		this.divisionId = divisionId;
	}
	
	public String getAppStatus() {	
		return appStatus;
	}
		
	public void setAppStatus(String appStatus) {	
		this.appStatus = appStatus;
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

	public List<Appflow> getAppflow() {
		return appflow;
	}

	public void setAppflow(List<Appflow> appflow) {
		this.appflow = appflow;
	}	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}
	
	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}
	
	public String getAppApprovalName() {
		return appApprovalName;
	}

	public void setAppApprovalName(String appApprovalName) {
		this.appApprovalName = appApprovalName;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Class: " + this.getClass().getCanonicalName() + "\n");
	    sb.append("Settings:\n");
	    for (Field field : this.getClass().getDeclaredFields()) {
	        try {
	            field.setAccessible(true);
	            sb.append(field.getName() + " = " + field.get(this) + "\n");
	        } catch (IllegalAccessException e) {
	            sb.append(field.getName() + " = " + "access denied\n");
	        }
	    }
	    return sb.toString();
	}
	
}
