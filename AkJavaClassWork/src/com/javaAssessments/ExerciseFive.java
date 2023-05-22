package com.javaAssessments;

import java.util.Scanner;

public class ExerciseFive {
	public boolean check(String strOne) {
		char arrayOne[]=strOne.toCharArray();
		boolean flag=true;
		for(int i=arrayOne.length-1;i>0;i--) {
			int asciiOne=arrayOne[i];
			int asciiTwo=arrayOne[i-1];
			if(asciiOne<asciiTwo) {
				flag=false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String strOne=sc.next();
		
		ExerciseFive objectOne=new ExerciseFive();
		System.out.println(objectOne.check(strOne));
		
		

	}

}
