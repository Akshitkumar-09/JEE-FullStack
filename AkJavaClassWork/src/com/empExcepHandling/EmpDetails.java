package com.empExcepHandling;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmpDetails {
	Employeeinfo emp = new Employeeinfo();

	boolean validateName(String name) {

Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{7,}");

	 Matcher matcher = pattern.matcher(name);
	 return matcher.find() ? true : false;

	    }
	boolean validateSalary(int salary) {
		return salary<3000? false : true;

	    }
	void setEmpDetails(int id, String name, int salary)
			throws InvalidEmpException {
		emp.setEmpId(id);
		if (validateName(name))
			emp.setEmpName(name);
		else
			
			throw new InvalidEmpException("NAme should have min. 8...");
		if (validateSalary(salary))
			emp.setEmpSal(salary);
		else
			throw new InvalidEmpException("Sal can't be less than 3000");
		void displayDetails() {
			System.out.println(emp.getEmpId() + " " + emp.getEmpName() + " " + emp.getEmpSal());
	}

	    }

}
