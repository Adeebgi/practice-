package practiceFrameWork;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Javapractice {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		
		//How to find the number of LowerCase and upperCase from the given string 
		String s="Sayed Esmatullah ADEEB In the Home";
		
		//create two variable with integer type and give the value zero
		int upper=0;
		int lower=0; 
		
		//use For loop to iterate in each and every character. 
		for(int i=0;i<s.length();i++) 
		{
			
			// change the string into character and return type is the char
			char ch=s.charAt(i);
			
			// use if condition and concatenated with && two condition  
			if (ch>=65 && ch<=90)
			{
				upper++;
			}else
			{
				lower++; 
			}
			
		}
System.out.println("number of upperCase:" +  upper);	
System.out.println("number of lowerCase:" +  lower);
	}

}
