package com.Collection;
import java.util.Collections;  
import java.util.Comparator;  
import java.util.HashMap;  
import java.util.Iterator;  
import java.util.LinkedHashMap;  
import java.util.LinkedList;  
import java.util.List;  
import java.util.Map;  
import java.util.Set;

   public class SortHashMapValue   {
	   public static void main(String[] args) {
		   HashMap<Integer, String> hm = new HashMap<Integer, String>();  
           hm.put(1, "Tushar");  
           hm.put(2, "Ashu");  
           hm.put(3, "Zoya");  
           hm.put(4, "Yash");  
           hm.put(5, "Praveen");  
           hm.put(6, "Boby");  
           hm.put(7, "Ritesh");
           System.out.println("Before Sorting:");
           Set set = hm.entrySet();
           Iterator iterator = set.iterator();
           while(iterator.hasNext()){
        	   Map.Entry map = (Map.Entry)iterator.next();
        	   System.out.println("Roll no: "+map.getKey()+"     Name: "+map.getValue());  
}
           Map<Integer, String> map = sortValues(hm);
           System.out.println("\n");
           System.out.println("After Sorting:");
           Set set2 = map.entrySet();
           Iterator iterator2 = set2.iterator();
           while(iterator2.hasNext()){
        	   Map.Entry me2 = (Map.Entry)iterator2.next();
        	   System.out.println("Roll no: "+me2.getKey()+"     Name: "+me2.getValue());  
}  
}
	   private static HashMap<Integer, String> sortValues(HashMap map){
		   List list = new LinkedList(map.entrySet());
		   Collections.sort(list, new Comparator() {
			   public int compare(Object o1, Object o2) {
				   return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());  
			   }  
			   
				   
});
		   HashMap sortedHashMap = new LinkedHashMap();
		   for (Iterator it = list.iterator(); it.hasNext();) {
			   Map.Entry entry = (Map.Entry) it.next();
			   sortedHashMap.put(entry.getKey(), entry.getValue());  
}
		   return sortedHashMap;  
}  
}  
