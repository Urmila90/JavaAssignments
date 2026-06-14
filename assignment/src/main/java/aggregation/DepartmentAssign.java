package aggregation;

public class DepartmentAssign {
	String DeptId, DeptName;// Instance variables
	EmployeeAssign emp_ref;

	// Parameterised constructor
	public DepartmentAssign(String DeptId, EmployeeAssign emp_ref) {
		this.DeptId = DeptId;
		this.emp_ref = emp_ref;
	}

	// Instance method
	public void DepartmentDetails(String DeptName, EmployeeAssign emp_ref) {
		this.DeptName = DeptName;
		this.emp_ref = emp_ref;
		System.out.println("Department id is:"+DeptId);
		System.out.println("Department name is:"+DeptName);
		//employee class variables
		System.out.println("Employee name is(passed from DepartmentAssign class):"+emp_ref.name);
		System.out.println("Employee age is(passed from DepartmentAssign class):"+emp_ref.age);
		System.out.println("Employee id is(passed from DepartmentAssign class):"+emp_ref.id);
		System.out.println("Employee state is(passed from DepartmentAssign class):"+emp_ref.state);
		
		
	}

	public static void main(String args[]) {

		EmployeeAssign obj1 = new EmployeeAssign("Samridhi", 20);
		obj1.EmployeeDetails(11, "Kerala");

		DepartmentAssign obj2 = new DepartmentAssign("12D", obj1);
		obj2.DepartmentDetails("Engineering", obj1);
	}

}
