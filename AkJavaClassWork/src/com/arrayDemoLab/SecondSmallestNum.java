package com.arrayDemoLab;

import java.util.*;

public class  SecondSmallestNum {
	public static int getSecondSmallest(int[] a) {
		Arrays.sort(a);

	return a[1];
}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int a[]= {8,6,5,1,3,9,7};
		
	}
		System.out.println("Second Smallest:"+getSecondSmallest(a,7));

	}

