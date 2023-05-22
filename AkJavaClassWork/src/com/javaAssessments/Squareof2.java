package com.javaAssessments;

public class Squareof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean t= false;
     int n=33, power=0, temp=0;
	while (temp<n) {
     temp=(int)(Math.pow(2,power));
     power++;
     if(temp==n)
     {
    	 t=true;
     }
     }
     if(t) {
	
     System.out.println("True");
		
	}
else
	System.out.print("False");
}
}