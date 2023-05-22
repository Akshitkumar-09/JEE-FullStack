package accessSpecifier;

public class StudentInfo {
	public String Name ="Rahul";//can be access in another package too
	int Class =8; // cannot access in another package
	protected int Rollno =13;  // cannot access in another package
	private int StudentID =2516;  // cannot access in same package diff class another package
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo std = new StudentInfo();
		System.out.println("Name:" +std.Name);
		System.out.println("Class:" +std.Class);
		System.out.println("Rollno:" +std.Rollno);
		System.out.println("StudentID:" +std.StudentID);
		
		

	}

}
    class Mentor extends StudentInfo {
    	String Surname = Name + "Kumar";
    	int StudentDetails = 1100 + StudentID;
    	
    }
    