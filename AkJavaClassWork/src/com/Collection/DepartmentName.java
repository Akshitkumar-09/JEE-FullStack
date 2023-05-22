package com.Collection;

import java.util.Comparator;

public class DepartmentName implements Comparator<DepartmentComparable> {
	
	@Override
	public int compare(DepartmentComparable o1, DepartmentComparable o2) {
		return o1.getDeptName(). compareTo(o2.getDeptName());
	}

}
