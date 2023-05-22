package com.javaAssessments;

import java.util.Scanner;

public class NumberModifier { 
	String strTwo="";
	public int modifyNumber(int numberOne) {
		String strOne=Integer.toString(numberOne);
		
		char arrayOne[]=strOne.toCharArray();
		
		for(int i=0;i<arrayOne.length-1;i++) {
			int a=arrayOne[i]-'0';
			int b=arrayOne[i+1]-'0';
			int c=Math.abs(a-b);
			
			strTwo=strTwo+Integer.toString(c);
		}
		strTwo=strTwo+arrayOne[arrayOne.length-1];
		Integer d=Integer.parseInt(strTwo);
		
		return d;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int NumberOne=sc.nextInt();
		
		NumberModifier objectName=new NumberModifier();
		System.out.println(objectName.modifyNumber(NumberOne));

	}

}
