
public class Student {
	int age;
	int rollenu;
	public void display1() {
		System.out.println("Welcome you all");
		
	}

	public void display2() {
		System.out.println("Automation is very easy");

	}
	
	public static void main(String[] args) {
		Student adeeb=new Student();
				adeeb.display1();
				adeeb.display2();
				adeeb.age=30;
				adeeb.rollenu=1;
				
				System.out.println(adeeb.age);
				System.out.println(adeeb.rollenu);
	}
		
	}

