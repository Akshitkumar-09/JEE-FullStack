package com.Collection;
import java.util.*;  
public class HashMapDemo{  
 public static void main(String args[]){  
   Map<Integer,String> map=new HashMap<Integer,String>();  
   map.put(1,"Mango");  //Putting elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(1,"Grapes"); //trying duplicate key  
   map.put(3,"Kiwi");   
   
    System.out.println(map.get(1)); 
    System.out.println(map.get(2));
    System.out.println(map.get(3));
    System.out.println(map.get(1));
    System.out.println(map.get(3));
    System.out.println(map.size());
   }  
}  
