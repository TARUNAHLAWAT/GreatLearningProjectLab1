package com.greatlearning.appmain;
import com.greatlearning.projectlab1.Employee;
import java.util.Scanner;

import com.greatlearning.service.CredentialService;


public class Driver {
  public static void main(String args[]) {
	 
	  //
Scanner scanner= new Scanner(System.in);
System.out.println("Enter first name");
String firstName= scanner.next();

System.out.println("Enter last name");
String lastName= scanner.next();
System.out.println("Enter Department");
System.out.println("Enter Department Name from following");
System.out.println("1. Technical");
System.out.println("2. Admin");
System.out.println("3. Human Resource");
System.out.println("4. Legal");
int choice= scanner.nextInt();
String email=null;
String password= null;



CredentialService credentialservice= new CredentialService();



if (choice==1) {
	Employee emp= new Employee(firstName, lastName, "Technical");
	email= credentialservice.generateEmail(firstName, lastName, "Technical");
	password = credentialservice.generatePassword();
System.out.println("email is::"+ email);	
System.out.println("password is ;;"+ password);
}else if(choice==2) {
	Employee emp= new Employee(firstName, lastName, "Admin");
	email= credentialservice.generateEmail(firstName, lastName, "Admin");
	password = credentialservice.generatePassword();
	System.out.println("email is::"+ email);
	System.out.println("password is ;;"+ password);
}else if(choice==3) {
	Employee emp= new Employee(firstName, lastName, "Human Resource");
	email=  credentialservice.generateEmail(firstName, lastName, "Human Resource");
	password = credentialservice.generatePassword();
	System.out.println("email is::"+ email);
	System.out.println("password is ;;"+ password);
}else if(choice==4) {
	Employee emp= new Employee(firstName, lastName, "Legal");
	email= credentialservice.generateEmail(firstName, lastName, "Legal");
	password = credentialservice.generatePassword();
	System.out.println("email is::"+ email);
	System.out.println("password is ;;"+ password);
}else {
	System.out.println(" enter valid input");
	
}







	  
	  
	  
	  
  }
	
	
}
