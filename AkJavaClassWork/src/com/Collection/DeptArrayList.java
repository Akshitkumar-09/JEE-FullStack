package com.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class DeptArrayList {
	public static void main(String args[]) {
		System.out.println("----------------------------------Generic Class-----------------------");
		
		List<DepartmentComparable> deptList= new ArrayList<>();
		deptList.add(new DepartmentComparable(100,"it","Akshit",12));
		deptList.add(new DepartmentComparable(300,"finance","Sid",8));
		deptList.add(new DepartmentComparable(400,"hr","thomas",6));
		
		Collections.sort(deptList);
		Iterator<DepartmentComparable> deptIterator=deptList.iterator();
		while(deptIterator.hasNext()) {
        DepartmentComparable de=deptIterator.next();
			System.out.println(de);
		}
		
		System.out.println("----------------------------------Generic Class-----------------------");
		List<DepartmentComparable> deptList1= new ArrayList<>();
		deptList1.add(new DepartmentComparable(100,"it","Akshit",12));
		deptList1.add(new DepartmentComparable(300,"finance","Sid",8));
		deptList1.add(new DepartmentComparable(400,"hr","thomas",6));
		
		Collections.sort(deptList1);
		
		Iterator<DepartmentComparable> deptIterator1=deptList1.iterator();
		while(deptIterator.hasNext()) {
			DepartmentComparable de=deptIterator.next();
			System.out.println(de);
		}
		
	}

}
