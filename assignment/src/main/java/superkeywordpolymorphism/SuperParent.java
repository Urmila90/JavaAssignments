package superkeywordpolymorphism;

public class SuperParent {
	int a, b, c;
	public int sum(int a, int b)
	{
		this.a=a;
		this.b=b;
		c = a+b;
		return c;
	}
	public void display()
	{
		System.out.println("Sum inside parent class is: "+c);

	}
	
	SuperParent(String name)
	{
		System.out.println("Name is: "+name);
		System.out.println("This is a parameterised parent constructor");
	}

}
