package Assignment23;

import java.util.Scanner;

public class April9 {
	
	public int sum1(int x1, int x2, int x3)
	{
		int sum=x1+x2; 
		int sumt=sum+x3;
		System.out.println(sumt);
		return sumt;
	}
	
	public int subtraction(int sumt, int x4)
	{
		int sub=sumt-x4;
		System.out.println(sub);
		return sub;
	}
	public int multiply(int sub, int x5)
	{
		int mult=sub*x5;
		System.out.println(mult);
		return mult;
	}
	public int division(int mult, int x6)
	{
		int div=mult/x6;
		System.out.println(div);
		return div;
	}

	public static void main(String[] args) {
		April9 ob=new April9();
		System.out.println("Enter two numbers to sum");
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt(); 
		int x2=	sc.nextInt(); 
			int sumresult=ob.sum1(x1, x2, x2);
		System.out.println("The result of Sum is: " +sumresult);
		
		System.out.println("Enter a number to subtract");
		int x4=sc.nextInt();
		int subt=ob.subtraction(sumresult, x4);
		System.out.println("The resutl of subtraction is: "+ subt);
		
		System.out.println("Enter a Number to multiyply");
		int x5=sc.nextInt();
		int multi=ob.multiply(subt, x5); 
		
		System.out.println("The Resutl of Mulitplication is: "+ multi);
		
	System.out.println("Enter a number to divide");
		int x6=sc.nextInt();
		 int divi=ob.division(multi, x6);
		 System.out.println("The Result of division is: " +divi);
		 
	}
}
