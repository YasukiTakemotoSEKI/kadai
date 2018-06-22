package com.kadai.entity;

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
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employee_id;
	@Column
	private int department_id;
	@Column
	private int division_id;
	@Column
	private int class_id;
	@Column
	private int employee_no;
	@Column
	private String employee_name;
	@Column
	private String employee_password;
	
	public Employee() {
	}
	public Employee(int department_id, int division_id, int class_id, int employee_no, String employee_name, String employee_password) {
		this();
		this.department_id = department_id;
		this.division_id = division_id;
		this.class_id = class_id;
		this.employee_no = employee_no;
		this.employee_name = employee_name;
		this.employee_password = employee_password;
	}
	public long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public int getDivision_id() {
		return division_id;
	}
	public void setDivision_id(int division_id) {
		this.division_id = division_id;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public int getEmployee_no() {
		return employee_no;
	}
	public void setEmployee_no(int employee_no) {
		this.employee_no = employee_no;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_password() {
		return employee_password;
	}
	public void setEmployee_password(String employee_password) {
		this.employee_password = employee_password;
	}
	@Override
	public String toString() {
		return "employee_id:" + employee_id;
	}
}
