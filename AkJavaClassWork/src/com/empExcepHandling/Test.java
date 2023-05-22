package com.empExcepHandling;
import java.util.Scanner;

public class Test {
	static EmpDetails empDetails;
	
	public static void main(String[] args) {
		empDetails = new EmpDetails();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter emp id");
		int id = scan.nextInt();
		System.out.println("Enter Name");
		String name = scan.next();
		System.out.println("Enter Salary");
		int sal = scan.nextInt();
		try {
			empDetails.setEmpDetails(id,  name,  sal);
			empDetails.displayDetails();
		} catch(InvalidEmpException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
