
public class Arithmatic {
	public int sum(int a , int b)
	{
		int c; 
		c=a+b; 
		System.out.println("Addition: "+c);
		return c; 
	}

	public int sub(int c, int b1)
	{
		int d; 
		d=c-b1; 
		System.out.println("Substraction: "+d);
		return d; 
	}
	
	public int multi(int a2, int b2)
	{
		int e;
		e=a2*b2;
		System.out.println("Multiplication: "+e);
		return e;
	}
	
	public void divide(int a3, int b3)
	{
		int f; 
		f=a3/b3;
		System.out.println("Division: "+f);
		
	}
	
	public static void main(String[] args) {
		
		Arithmatic ari=new Arithmatic();
		int subsum=ari.sum(10, 2);
		int tsum=ari.sum(subsum, 2);
		int subt=ari.sub(tsum, 2);
		int multit=ari.multi(subt, 2);
		ari.divide(multit, 2);
		
		
	}
}
