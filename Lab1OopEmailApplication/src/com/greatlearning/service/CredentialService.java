package com.greatlearning.service;

import java.util.*;
import com.greatlearning.company.Employee;

public class CredentialService {
	
	public char[] generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "~!@#$%^&*_+-/*<>/";
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random = new Random();
		
		char[] password = new char[10];
		for(int i=0; i<10; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		
		return password;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		return firstName+lastName+"@"+department+".rdm.com";
	}
	
	public void showCredentials(Employee employee, String email, String generatedPassword) {
		
		System.out.println("Hello "+employee.getFirstName()+" your generated credentials are as follows: ");
		System.out.println("Work Email --> "+email);
		System.out.println("Temporary Password --> "+generatedPassword);
	}
}