/*2. Create a class Student that inherits from Person
 Additional attributes:
•	rollNumber 
•	grade 
Requirements:
•	Use the super keyword to call the parent constructor. 
•	Override displayDetails(). 
*/
package schoolmanagementsystem;

public class Student extends Person {

	int rollNumber;
	String grade;

	Student(int rollNumber, String grade) {
		super("Vedha", 7);// call parent constructor
		this.rollNumber = rollNumber;
		this.grade = grade;

	}

	public void displayDetails() {
		super.displayDetails(); // invoked parent class method using super keyword (overriding)
		System.out.println("Student roll number(in child class Student) is: " + rollNumber);
		System.out.println("Student grade (in child class Student) is: " + grade);
		/*
		 * to call variables in parent class separately: System.out.println("Person name
		 * (invoked from Person parent class using super) is: "+super.name);
		 * System.out.println("Person age (invoked from Person parent class using super)
		 * is: "+super.age);
		 */

	}

	/*
	 * public static void main(String[] args) { Student obj1 = new Student(30,
	 * "A+"); obj1.displayDetails(); }
	 */

}
