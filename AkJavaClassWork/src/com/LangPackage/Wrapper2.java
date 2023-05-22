package com.LangPackage;

public class Wrapper2 {

	public static void main(String[] a) {
		// Wrapper to Primitive
		Integer iobj1 = new Integer(100);
		int i = iobj1.intValue();
		int j=iobj1;    //Unboxing
       System.out.println(i+j);
	}

}
