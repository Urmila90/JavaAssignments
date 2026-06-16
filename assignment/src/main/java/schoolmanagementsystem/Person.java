package schoolmanagementsystem;

/* Assignment: School Management System
Problem Statement
Create a Java program to manage students and teachers in a school.
Requirements
1. Create a base class Person
Attributes:
•	name 
•	age 
Methods:
•	Constructor to initialize attributes. 
•	displayDetails() to print person information. 
 */
public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
		System.out.println("Person name (in Person parent class) is: " + name);
		System.out.println("Person age (in Person parent class) is: " + age);
	}

}
