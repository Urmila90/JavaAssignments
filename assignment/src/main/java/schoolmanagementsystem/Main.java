/* 6. Main Class
Create:
•	One Student 
•	One Teacher 
•	One Department 
Display all details.

 */
package schoolmanagementsystem;

public class Main{

	public static void main(String[] args) {
		Department d1=new Department("IT");
		d1.displayDepartment();
		Student s1=new Student(11,"A+");
		s1.displayDetails();
		
		Teacher t1=new Teacher("Database", 100000, d1);
		t1.displayDetails();
				

	}

}
