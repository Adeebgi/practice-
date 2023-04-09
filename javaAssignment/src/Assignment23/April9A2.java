package Assignment23;

import java.util.Scanner;

public class April9A2 {
	
	public int multiply(int x1, int x2)
	
	{
		int mulit=x1*x2;
		return mulit;
	}

	public int  Subtraction(int mulit, int x3, int x4)
	{
	int subt=mulit-x3; 
	int subto=subt-x4;
	return subto; 
	}
	public int addition(int subto, int x5)
	{
		int add=subto+x5;
		return add; 
	}
	public int division(int add, int x6)
	{
		int div=add/x6;
		return div;
	}
	
	public static void main(String[] args) {
		April9A2 as= new April9A2();
		System.out.println("Enter two numbers to multiply");
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int x2=sc.nextInt(); 
		int mulit=as.multiply(x1, x2);
		System.out.println("The Result of multiplication is: " +mulit);
		
		System.out.println("Enter a number to substract");
		int x3=sc.nextInt();
		int x4=sc.nextInt();
		int subt=as.Subtraction(mulit, x3, x4); 
		System.out.println("The Resutl of Subtraction is: " +subt );
		
		System.out.println("Enter a number to sum");
		int x5=sc.nextInt();
		int sumt=as.addition(subt, x5);
		System.out.println("The Result of addition is: " + sumt);
		
		System.out.println("Enter a number to divide");
		int x6=sc.nextInt();
		int divR=as.division(sumt, x6);
		System.out.println("The result of division is: " + divR);
		
	}
}
