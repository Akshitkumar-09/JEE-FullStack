
package com.Date;
import java.time.LocalDate;



public class Employee {
private int empId;
private String empName;
private String empDateofJoin;
private static String company = "Capgemini";
public Employee(int empId, String empName, String empDateofJoin) {
this.empId = empId;
this.empName = empName;
this.empDateofJoin = empDateofJoin;

}
public int getEmpId() {

return this.empId;

}
public String getEmpName() {

return this.empName;

}
public String getEmpDateofJoin() {




return this.empDateofJoin;
}



public static String getCompany() {

return company;

}

}
package com.Date;

import java.time.LocalDate;

import java.time.Period;

import java.time.format.DateTimeFormatter;

import java.util.Scanner;



public class DateUseDemo {



public static void main(String[] args) {

// TODO Auto-generated method stub


Scanner s = new Scanner(System.in);


//Initializing the employee Array
        Employee empList[] = new Employee[10];

        int empId;

        String empName;

        String empDoj;


int choice;

int count=0;


LocalDate localDate = null;

DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

Period period=null;

LocalDate start =null;

LocalDate end = null;

int tempId;




do

{
System.out.println("1.Add Employee\n2.Delete Employee\n3.View All Employee\n4.View Employee by Id\n5.Update Employee Details\n6.Exit");

System.out.println("\nEnter choice : ");

choice = s.nextInt();


            switch(choice)

            {

                //Case 1st for Add Employee

                case 1:

                    System.out.println("Enter Employee Id : ");

                    empId = s.nextInt();


                    System.out.println("Enter Employee Name : ");

                    empName = s.next();



                    System.out.println("Enter Employee Date of joining in formate dd/mm/yyyy: ");



                    empDoj = s.next();


                    LocalDate.parse(empDoj,dateTimeFormatter);


                    System.out.println("Employee Addedd");


                    empList[count++] = new Employee(empId, empName, empDoj);

                break;

                //Case 2 for delete employee

                case 2:

                    System.out.println("Enter Id : ");

                    tempId = s.nextInt();

                    for(int empNo=0;empNo<count;empNo++)

                    {

                        if(empList[empNo].getEmpId()==tempId)

                        {

                            empList[empNo] = null;

                        }

                    }

                    System.out.println("Deleted..\n");

                    break;

                    //All Employee Details

                case 3:

                    System.out.println("All Employee Details : ");


                    for(int empNo=0;empNo<count;empNo++)

                    {

                        if(empList[empNo]!=null)

                        {

                            System.out.println("Id : "+empList[empNo].getEmpId());

                            System.out.println("Name : "+empList[empNo].getEmpName());

                            System.out.println("Name : "+empList[empNo].getCompany());



                             start = LocalDate.parse(empList[empNo].getEmpDateofJoin(),dateTimeFormatter);


                             end = LocalDate.now();


                             period = start.until(end);

                            System.out.println("No of years served : "+period.getYears());

                            System.out.println();

                        }

                    }

                    break;

                    //case 4 for one employee details

                case 4:

                    System.out.println("Enter id to view Employee details : ");


                    tempId = s.nextInt();


for(int empNo=0;empNo<count;empNo++)

{

if(empList[empNo].getEmpId()==tempId)

{

 System.out.println("Id : "+empList[empNo].getEmpId());

System.out.println("Name : "+empList[empNo].getEmpName());

System.out.println("Name : "+empList[empNo].getCompany());

start = LocalDate.parse(empList[empNo].getEmpDateofJoin(),dateTimeFormatter);


 end = LocalDate.now();


period = start.until(end);

System.out.println("No of years served : "+period.getYears());

          }

 }

break;
//case 5 for update employee details

case 5;

System.out.println("Enter Employee Id : ");

tempId = s.nextInt();

for(int empNo=0;empNo<count;empNo++)

{

if(empList[empNo].getEmpId()==tempId)

{

System.out.println("Enter Name ");

empName = s.next();

System.out.println("Enter Date of joining");



empDoj = s.next();

empList[empNo] = new Employee(empList[empNo].getEmpId(), empName, empDoj);

}

}

System.out.println("Updated\n");

break;

//case 6 to exit

case 6:

choice=6;

System.out.println("Exited");

break;
default:

System.out.println("Wrong Choice");

}


}while(choice!=6);


}

 

}

 


	}

}
