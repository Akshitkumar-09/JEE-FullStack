package com.javaAssessments;
import java.util.Scanner;

public class StringConsonent {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next(); //input
		str = alterString(str.toLowerCase());
		System.out.println(str);
	}
	
	private static String alterString(String str) {
		String newStr = "";
		if (!str.isEmpty()) {
			char ch = ' ';
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if(ch =='a' || ch == 'e' || ch == 'o' || ch == 'u') {
					newStr += ch;
				} else {
					if (ch== 'z') {
						newStr += 'a';
					}
					
					newStr += ((char) (ch + 1));
				}
			}
		}
		return newStr;
			
			
			
		}
	}





