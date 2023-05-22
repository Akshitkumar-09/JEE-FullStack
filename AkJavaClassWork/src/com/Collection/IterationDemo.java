package com.Collection;
import java.util.Map;
import java.util.HashMap;

class IterationDemo {
	public static void main(String[] arg) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();   
    	map.put("Bihar", 128500364);               
    	map.put("Uttar Pradesh", 199812341);   
    	map.put("Maharashtra", 112374333);
    	//using Keyset() method for iteration over keySet  
    	for (String State : map.keySet())   
    	System.out.println("State: " + State);
    	System.out.println("--------------------------------------");
    	 //using values() for iteration over keys  
    	for (Integer Population : map.values())        
    	System.out.println("Population: " + Population);
    	System.out.println("--------------------------------------");
    	// Using entrySet() to get the set view
        System.out.println("State + Population: " + map.entrySet());
    	}   
       
    }




