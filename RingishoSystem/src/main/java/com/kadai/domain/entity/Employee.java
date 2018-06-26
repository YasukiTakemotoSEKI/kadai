package com.kadai.domain.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="Employee")
public class Employee implements UserDetails {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	@Column(name = "department_id")
	private int departmentId;
	
	@Column(name = "division_id")
	private int divisionId;
	
	@Column(name = "position_id")
	private int positionId;
	
	@Column(name = "employee_no")
	private int employeeNo;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "employee_password")
	private String employeePassword;
	
	public Employee() {
	}
	
	public Employee(int departmentId, int divisionId, int positionId, int employeeNo, String employeeName, String employeePassword) {
		this();
		this.departmentId = departmentId;
		this.divisionId = divisionId;
		this.positionId = positionId;
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.employeePassword = employeePassword;
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
	
	public int getDivisionId() {
		return divisionId;
	}
	
	public void setDivisionId(int divisionId) {
		this.divisionId = divisionId;
	}
	
	public int getClassId() {
		return positionId;
	}
	
	public void setClassId(int positionId) {
		this.positionId = positionId;
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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return employeePassword;
	}

	@Override
	public String getUsername() {
		return employeeName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
