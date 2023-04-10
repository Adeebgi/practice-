package Assignment23;

public class Parent {
	public Parent()
	{
	 this(8);
		System.out.println("Parent default Constructor");
		
	}
	public Parent (int a)
	{
		 this(5,6);
		System.out.println("Parent single parameterized Constructor");
	}
	
	public Parent (int a1, int b)
	
{
		 this(9,8,7);
	System.out.println("Parent Two parametrization Contstructor");
}

	public Parent (int b1, int c, int d)
{

		 
	System.out.println("Parent Three Parametrization Constrcutor");
}

	public Parent (int e, int f, int g, int h)
{
	 
	System.out.println("Parent Four Parameterization Constructor");
}
}
