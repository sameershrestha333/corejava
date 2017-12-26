package constructor;

class Student4 {
	// fields
	int id;
	String name;

	// parameterized constructor
	Student4(int i, String n) {
		id = i;
		name = n;
	}
	// method
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		
		Student4 s4 = new Student4(10, "Ktm");
		s4.display();
		
	}
}