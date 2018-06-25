package com.kadai.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;
	
	@Column(name = "department_id")
	private int departmentId;
	
	@Column(name = "division_id")
	private int divisionId;
	
	@Column(name = "class_id")
	private int classId;
	
	@Column(name = "employee_no")
	private int employeeNo;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "employee_password")
	private String employeePassword;
	
	public Employee() {
	}
	
	public Employee(int departmentId, int divisionId, int classId, int employeeNo, String employeeName, String employeePassword) {
		this();
		this.departmentId = departmentId;
		this.divisionId = divisionId;
		this.classId = classId;
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.employeePassword = employeePassword;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(long employeeId) {
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
	
	public int getClassId() {
		return classId;
	}
	
	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	public int getEmployeeNo() {
		return employeeNo;
	}
	
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeePassword() {
		return employeePassword;
	}
	
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
}
