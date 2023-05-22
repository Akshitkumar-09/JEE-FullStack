package com.LangPackage;

public class Wrapperclass {
	
	public static void main(String[] args) {
		//Primitive to Wrapper
		int i= 100;
		Integer iobj = Integer.valueOf(i);
		Integer iobj1 = i; //Autoboxing
		System.out.println(iobj+iobj1);
	}

}
