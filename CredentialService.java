package com.greatlearning.service;
import java.util.Random;
import com.greatlearning.appmain.Driver;
import com.greatlearning.projectlab1.Employee;
public class CredentialService {

	public String generateEmail( String firstName, String lastName, String department) {
		String email= firstName+ lastName+ "@"+ department+ ".greatlearning.com";
		return email;
	}
	public String generatePassword(){
		String capitalLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters= "abcdefghijklmnopqrstuvwxyz";
		String Numbers= "0123456789";
		String Special= "!@#$%^&*()<>_+-=.,?/";
		String values= capitalLetters+smallLetters+Numbers+Special;
		Random random= new Random();
		char[] password= new char[8];
		password[0] = smallLetters.charAt(random.nextInt(smallLetters.length()));
	      password[1] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
	      password[2] = Special.charAt(random.nextInt(Special.length()));
	      password[3] = Numbers.charAt(random.nextInt(Numbers.length()));
	   
	      for(int i = 4; i< 8 ; i++) {
	         password[i] = values.charAt(random.nextInt(values.length()));
		}
			return String.valueOf(password);	
	}
	
	public void showCreds(Employee emp, String email, String password ) {
		System.out.println("Hello"+ emp.getFirstName() +"your generated credentials");
		System.out.println(email);
		System.out.println(password);
		
		
		
	}
	
	
	
}
