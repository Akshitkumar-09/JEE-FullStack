package com.javaAssessments;

import java.util.Scanner;

public class Trafficlight {
	
		public static void main(String[] args) {
			String traffic;
	    do {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	traffic=sc.next();
	    	
	    	switch (traffic) {
	    	case "red": {
	    		System.out.println("STOP");
	    		break;
	    	}
	    	case "yellow": {
	    		System.out.println("WAIT");
	    		break;
	    }
	    	case "green": {
	    		System.out.println("GO");
	    		break;

		}
	    	default:
	    		System.out.println("Invalid Expression");
	    	}
	    }
	    while(traffic!=("red") || traffic!=("yellow") || traffic!=("green"));

		


	}

}
