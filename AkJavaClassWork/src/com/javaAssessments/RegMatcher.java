package com.javaAssessments;

import java.util.regex.Pattern;

public class RegMatcher {

	public static boolean isValidMobileNo(String str) {
		// TODO Auto-generated method stub
		Pattern ptrn = Pattern.compile("(\\+91)?[7-9][0-9]{9}");
		Matcher match = ptrn.matcher(str);
		return (match.find() && match.group().equals(str));
	}
	public static void main(String args[]) {
		String str = "+919800088899";
		System.out.println("It is a valid mobile number.");
		else
			System.out.println("Entered mobile number is invalid.");
		
     }

	}


