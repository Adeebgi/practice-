package practiceFrameWork;

import java.util.Scanner;

public class javap {

	public static void main(String[] args) {
		//swap 2 numbers with creating third variable 
		int a=10; 
		int b=20; 
		
		a=a+b; 
		b=a-b;
		a=a-b; 
		System.out.println("A value is:" + a);
		System.out.println(b);
		
		
		
		//Swap to string 

String u="United";
String s="State"; 
	u=u+s;
	s=u.substring(0, (u).length()-s.length());
	u=u.substring(s.length()); 
	System.out.println(u);
	System.out.println(s);
	
	// find out how many alpha character present in String 
	String h="codetestinginterview234454643!@#$$";
	String em=h.replaceAll("[1-9]", "");
	int nalph=		h.length()-em.length();
	System.out.println(nalph);
	
	//how to find whether give number is odd number 

	int y=27;
	if(y%3!=0) {
		System.out.println("the number is even");
	}else {
		System.out.println("the number is odd");
	}
	
	//How to find out the part of string From a string? 
	String v="Capco is a great place for groming";
	String sub=v.substring(0);
	System.out.println(sub);
	
	//find out number of words in the string
	String[] spl=v.split("");
	System.out.println(spl.length);
	for(String str:spl) {
		System.out.println(str);
		
		
		}
	
	// reverse the string 
			String w="Testing"; 
			StringBuffer sb=new StringBuffer(w);
			sb.reverse(); 
		//	System.out.println(sb);
			String emp="";
			for(int i=w.length()-1;i>=0;i--)
			{
				emp=emp+w.charAt(i);
			}
			System.out.println(emp);
			
			
			
			// reverse the integer
			int j=567; 
		String nu=	String.valueOf(j);
		StringBuffer bh=new StringBuffer(nu);
	 System.out.println(bh.reverse()); 
	 
	 //How to get a matching element in the integer
	 
	 int[] n= {1,2,3,2,3,2,4,5,6};
	 for(int i=0;i<n.length;i++) {
		 for(int p=i;p+1<n.length;p++) {
			 if(n[i]== n[p]) 
				 System.out.println(n[i]);
				 
			 }
		 
	 }
	 
	 // How to find the max and min number in the array 
	 int[] z= {20,30,40,50,60};
	 /*int max=z[0]; 
	 for(int i=1; i<z.length;i++) {
		 if(z[i]>max) {
			 max=z[i];
			 
		 }
	 }
	 System.out.println(max);*/
	int min=z[0];
	for(int i=1;i>z.length;i++)
	{
		if (z[i]>min)
		{
			min=z[i];
		}
	}
	System.out.println(min);
	
	
	String t="qasim";
	String r="najib";
	String Temp; 
	Temp=t;
	t=r;
	r=Temp;
	System.out.println("T is : " + t);
	System.out.println("r is : " + r);
	
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("What is your Name? ");
	String Name=scanner.nextLine();
	
	System.err.println("How old are you? ");
	int age=scanner.nextInt();
	
	scanner.nextLine();
	System.out.println("What is your favorite foood? ");
	String food=scanner.nextLine();
	
	System.out.println("How Many Brother do you have? ");
	int brother=scanner.nextInt();
	System.out.println("Your Name is "+Name);
	System.out.println(" You are "+age+Name);
	System.out.println("Your favorite food is "+food+" Mr. "+ Name);
	System.out.println("Ok, You have " +brother+ " brothers");
	
	
	//Operator are like +,-, *, /, modular (%) is used to show remainder of a group. 
	//Operands: value, variable, number and quantity 
	}
	
	}

	

	
