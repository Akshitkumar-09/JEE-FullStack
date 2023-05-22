package com.javaAssessments;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		int b=0;
		int c;
		try {
			c=a/b;
			System.out.println("Result " + c);
		} catch (Exception d) {
			System.out.println("Divided by 0");
		}
		System.out.println("Execution Continues");

	}

}
