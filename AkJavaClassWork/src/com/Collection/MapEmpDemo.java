package com.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEmpDemo {
	public static void main(String[]args) {
		Map<String, List<Employee>> map = new HashMap<>();
	    Employee emp1 = new Employee(100,"Amit",50000);
	    Employee emp2 = new Employee(101, "Anu", 80000);
	    Employee emp3 = new Employee(102, "Geeta", 30000);
	    Employee emp4 = new Employee(101, "Anuj", 30000);
	    List<Employee> list1 = new ArrayList<>();
	    list1.add(emp1);
	    list1.add(emp2);
	    List<Employee> list2 = new ArrayList<>();
	    list2.add(emp3);
	    list2.add(emp4);
	    list2.add(emp1);
	    map.put("Finance", list1);
	    map.put("HR", list2);
	    
	    List<Employee> empList=map.get("HR");
	    System.out.println(empList.size());
	    
	    List<String> names = new ArrayList<>();
   List<Employee> list=map.get("Finance");
    for(Employee emp: list) {
    	names.add(emp.getEmpName());
    }
	   
   Collections.sort(names);
   System.out.println("Person working in Finance Dept are:"+names);
	}
}
