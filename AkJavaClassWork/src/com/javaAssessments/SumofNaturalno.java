package com.javaAssessments;
import java.util.Scanner;

public class SumofNaturalno {

	public static void main(String[] args) {
		int sum=0, three=0, five=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		for(int i=0;i<=number;i++) {
			sum=number*(number+1)/2;
			
			three=sum/3;
			five=sum/5;
		}
		System.out.println("Sum is " +sum);
		System.out.println("Divided by Three is " +three);
		System.out.println("Divided by Five is " +five);

	}

}
