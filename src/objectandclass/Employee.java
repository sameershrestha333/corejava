package objectandclass;

public class Employee {
	// fields or variable
	int id;
	String name;
	float salary;

	// Methods
	void insert(int i, String n, float s) {
		id = i;
		name = n;
		salary = s;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
	
	public static void main(String[] args) {
		// Creating obj of Employee
		Employee emp = new Employee();
		emp.insert(10, "Ram", 50);
		emp.display();
	}

}
