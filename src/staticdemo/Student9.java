package staticdemo;

class Student9 {
	int rollno;
	String name;	

	
	 static void display() {
		System.out.println("I am static method");
	}

	public static void main(String args[]) {

	/*	Student9 s1 = new Student9();
		s1.display(10, "Ktm");*/
		/*Student9 s9 = new Student9();
		s9.display();*/
		
		
		// class name . method name
		Student9.display();
	
	}
}