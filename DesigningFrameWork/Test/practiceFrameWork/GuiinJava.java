package practiceFrameWork;

import javax.swing.JOptionPane;

public class GuiinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionPane is used to create a Graphical User Interaction in Java. this Only accept string. 
		String name=JOptionPane.showInputDialog("Enter your Name");
		JOptionPane.showMessageDialog(null, "Hello "+ name);
		
		//to enter the age, we need to change the integer.parsInt (pass JOption inside);
		int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
		JOptionPane.showMessageDialog(null, "Mr. "+ name+ "Your age is " +age +".");
		
		// to enter the hight, we need to change double into string by using double.parseDouble 
		double hight = Double.parseDouble(JOptionPane.showInputDialog("Enter your Hight"));
		JOptionPane.showMessageDialog(null, "Mr. "+ name+ "Your Hight is " +hight +"CM.");
		// to enter the weight, we need to change double into String 
		
		long phoneN=Long.parseLong(JOptionPane.showInputDialog("Enter your Phone Number"));
		JOptionPane.showMessageDialog(null, "Your phone number is " +phoneN+ ".");
	}

}
