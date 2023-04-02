
public class Arthimatic2 {

	public int Mulitply(int a, int b)
	{
		int c;
		c=a*b; 
		System.out.println("Multiplication: "+c);
		return c;
	}
	
	public int Subtraction(int a1, int b1)
	{
		int d;
		d=a1-b1; 
		System.out.println("Subtraction: "+ d);
		return d;
	}
	
	public int addition (int a3, int b3)
	{
		int e; 
		e=a3+b3; 
		System.out.println("Addition: "+e);
		return e;
	}
	
	public void division(int a4, int b4)
	{
		int f; 
		f= a4/b4; 
		System.out.println("Division: "+ f);
	}
	
	public static void main(String[] args) {
		Arthimatic2 ob=new Arthimatic2();
		int multi=ob.Mulitply(10, 2);
		int sub=ob.Subtraction(multi, 2);
		int sum=ob.addition(sub, 2);
		int sub1=ob.Subtraction(sum, 2);
		ob.addition(sub1, 2);
		
	}
}

