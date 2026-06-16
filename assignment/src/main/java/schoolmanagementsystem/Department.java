/* 4. Create a class Department
Attributes:
•	departmentName 
Methods:
•	Constructor 
•	displayDepartment() 
5. Aggregation
A Teacher belongs to a Department.
•	Create a Department object separately. 
•	Pass the Department object to the Teacher constructor. 
•	This demonstrates Aggregation (HAS-A relationship). 



 */
package schoolmanagementsystem;

public class Department {

	String departmentName;
	Teacher teacher_ref;
	public Department(String departmentName) {
		this.departmentName = departmentName;
	}

	public void displayDepartment() {
		System.out.println("Department name is: " + departmentName);
	}
	
//	public static void main(String args[])
//	{
//		Department obj3=new Department("IT");
//		obj3.displayDepartment();
//		
//	}

}
