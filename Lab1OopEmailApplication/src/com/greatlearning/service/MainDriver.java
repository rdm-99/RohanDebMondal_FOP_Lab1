package com.greatlearning.service;

import java.util.Scanner;
import com.greatlearning.company.Employee;

public class MainDriver {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Rohan","Mondal");
		CredentialService service = new CredentialService();
		String generatedEmail;
		String generatedPassword;
		
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		sc.close();
		
		if(option == 1) {
			generatedEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech");
			generatedPassword = String.valueOf(service.generatePassword());
			service.showCredentials(employee, generatedEmail, generatedPassword);
		}
		else if(option == 2) {
			generatedEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admin");
			generatedPassword = String.valueOf(service.generatePassword());
			service.showCredentials(employee, generatedEmail, generatedPassword);
		}
		else if(option == 3) {
			generatedEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr");
			generatedPassword = String.valueOf(service.generatePassword());
			service.showCredentials(employee, generatedEmail, generatedPassword);
		}
		else if(option == 4) {
			generatedEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal");
			generatedPassword = String.valueOf(service.generatePassword());
			service.showCredentials(employee, generatedEmail, generatedPassword);
		}
		else {
			System.out.println("Incorrect entry!!! Contact support team for help.");
		}
	}
}
