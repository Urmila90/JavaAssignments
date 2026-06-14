package aggregation;

public class EmployeeAssign {
	String name, state;
	int age, id;

	// parameterised constructor
	public EmployeeAssign(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//instance method
	public void EmployeeDetails(int id, String state) {
		this.id = id;
		this.state = state;
		System.out.println("Employee name is:"+name);
		System.out.println("Employee age is:"+age);
		System.out.println("Employee id is:"+id);
		System.out.println("Employee state is:"+state);



		
	}

}
