package com.javaAssessments;
import java.util.Scanner;

public class SumofNaturalDivisiblebyTwoThree {
	int sum;
	public int calculateSum(int n) {
		for(int i=1;i<=n;i++) {
			sum = n*(n+1)/2;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int five=0,three=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		SumofNaturalDivisiblebyTwoThree natural = new SumofNaturalDivisiblebyTwoThree();
		
		int sum = natural.calculateSum(number);
		System.out.println("Sum is " +sum);
		three=sum/3;
		System.out.println("Divided by Three is " +three);
		five=sum/5;
		System.out.println("Divided by Five is " +five);

	}

}
