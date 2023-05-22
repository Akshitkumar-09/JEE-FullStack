package com.ExceptionHandling;
import java.util.Scanner;

public class ValidateAgeException {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = s.nextInt();
		try {
			if(age < 15)
				throw new AgeException("Invalid Age");
			else
				System.out.println("Valid Age"); 
		}
				
		catch (AgeException a) {
			System.out.println(a);
		}

	
	}
}
