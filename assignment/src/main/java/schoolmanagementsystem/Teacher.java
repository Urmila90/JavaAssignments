/*
 * 3. Create a class Teacher that inherits from Person Additional attributes: •
 * subject • salary Requirements: • Use the super keyword. • Override
 * displayDetails().
 * 
 * 5. Aggregation
A Teacher belongs to a Department.
•	Create a Department object separately. 
•	Pass the Department object to the Teacher constructor. 
•	This demonstrates Aggregation (HAS-A relationship). 

 */
package schoolmanagementsystem;

public class Teacher extends Person {

	String subject;
	int salary;
	Department dept_ref;

	Teacher(String subject, int salary, Department dept_ref) {
		super("Samanwitha", 4);
		this.subject = subject;
		this.salary = salary;
		this.dept_ref=dept_ref;

	}

	public void displayDetails() {
		System.out.println("Subject (in child class Teacher) is: " + subject);
		System.out.println("Salary (in child class Teacher) is: " + salary);
		super.displayDetails();
	}

//	public static void main(String[] args) {
//		Department obj3 = new Department("Maths");
//		obj3.displayDepartment();
//
//		Teacher obj4 = new Teacher("Computer Science", 50000,obj3);// calling Teacher/child constructor-inside it, parent
//																// class constructor is first called
//																// Super("Samanwitha",4)
//		obj4.displayDetails();
//	}

}
