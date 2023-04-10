package Assignment23;

public class child extends Parent 
{
	
	public child()
	{
		this(8,9); 
		System.out.println("Child default constructor");
	}
	
	public child(int a)
	{
		 this();
 		System.out.println("Child single parameterization constructor");
	}
	
	public child (int b, int c)
	{
	
		
		System.out.println(" Child two Parameterization Constructor");
	}
	
	public child (int d, int e, int f)
		
	{
		 this(8);
		System.out.println("Child three Parameterization Constructor");
	}
	public child (int g, int h, int i, int j)
	{
	 super(3,4,7);
		System.out.println("child four Parameterization constructor");
	}

	public static void main(String[] args) {
		child ch=new child(12,34,34);
		
	
	}
}
