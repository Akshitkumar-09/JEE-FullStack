package com.javaAssessments;

public class Fibonaccis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=10;
		int num1=1;
		int num2=1;
		
		int sum=0;
		int i;
		
		System.out.print(num1);
		System.out.print(" "+num2);
		
		for(i=0;i<number-2;i++) {
			sum=num1+num2;
			
			num1=num2;
			num2=sum;
			
			System.out.print(" "+sum);
		}
		System.out.println();
		System.out.print(number+"th number of the series is:"+sum);
		
	}

}
