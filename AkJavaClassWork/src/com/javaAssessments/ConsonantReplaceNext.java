package com.javaAssessments;

import java.util.Scanner;

public class ConsonantReplaceNext {
public String alterString(String str) {
	char arrayOne[]=str.toCharArray();
	
	for(int i=0;i<arrayOne.length;i++) {
		if(arrayOne[i]!='A'&&arrayOne[i]!='I'&&arrayOne[i]!='O'&&arrayOne[i]!='U') {
			int ascii=arrayOne[i]+1;
			arrayOne[i]=(char)ascii;
		}
	}
	String strTwo=new String(arrayOne);
	return strTwo;  

    }
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next().toUpperCase();
	ConsonantReplaceNext objectName=new ConsonantReplaceNext();
	System.out.println(objectName.alterString(str));
}
}



