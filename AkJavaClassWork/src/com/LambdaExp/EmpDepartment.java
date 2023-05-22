package com.LambdaExp;
import java.util.List;
import java.util.Optional;

import com.Collection.Employee;

public class EmpDepartment {
	List<Employee> emp = EmployeeRepository.getEmployees();

	List<Employee> dep = EmployeeRepository.getEmployees();

	


	

	


	public void SumOfSalary() {

    Optional<Double> em = emp.stream().map(e->e.getSalary()).reduce((salary1,salary2)->salary1+salary2);

	System.out.println("sum of salary is"+ em.get());

	    }

	

	public void CountEmployeeInEachDept() {

	long m = emp.stream().filter(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("Administration")).map(Employee::getFirstName).count();

	System.out.println("the Employee in Administration is " + m);

	    }
	public void EmpWithoutManager() {
		emp.stream().filter(e -> e.getManagerId()==0).map(Employee::getFirstName).forEach(System.out::println);

	            }
	public void DeptWithoutEmployee() {

	emp.stream().filter(e->e.getDepartment().equals(null)).map(e->e.getFirstName()).forEach(System.out::println);

	    }
	public void EmployeeWithoutDept() {
		emp.stream().filter(e->e.getDepartment().equals(null)).map(e->e.getFirstName()).forEach(System.out::println);

	        }
	public static void main(String arg[]) {
		EmployeeService r = new EmployeeService();

	r.SumOfSalary();

	r.CountEmployeeInEachDept();
	r.EmpWithoutManager();

	//r.DeptWithoutEmployee();

	r.EmployeeWithoutDept();
	}
	}

