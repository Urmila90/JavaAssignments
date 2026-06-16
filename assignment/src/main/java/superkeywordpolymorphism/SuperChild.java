package superkeywordpolymorphism;

public class SuperChild extends SuperParent{

	int a, b, c;
	String name;

	public int sum(int a, int b) {
		this.a = a;
		this.b = b;
		c = a + b;
		return c;
		
	}

	public void display() {
		//sum(20,30);
		//super.sum(10,20);
		System.out.println("Sum inside child class is: " +sum(20,30));
		System.out.println("Sum inside parent class is: " + super.sum(100,100));
		super.display();	 //calling parent class instance method display()

	}

	public SuperChild() {
		super("Samanwitha"); // parent class constructor calling
		System.out.println("This is a non-parameterised child constructor");
		

	}

	public static void main(String[] args) {
		SuperChild sp = new SuperChild();
		sp.display(); //calling child class instance method display()



	}

}
