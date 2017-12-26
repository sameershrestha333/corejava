package constructor;

public class Student3 {
	// fields or variables
	int id;
	String name;

	// default
	
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Student3 s1 = new Student3();
		s1.display();
	}
}
