package com.greatlearning.projectlab1;
import com.greatlearning.appmain.Driver;
import com.greatlearning.service.CredentialService;
public class Employee {


	
	String firstName, lastName, departmentName;
 public Employee( String firstName, String lastName, String departmentNAme) {
	super();
	this.firstName=firstName;
	this.lastName=lastName;
	this.departmentName=departmentName;
	
	
}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
