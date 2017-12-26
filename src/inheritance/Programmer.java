package inheritance;

public class Programmer extends Employee  {
	int bonus = 5000;
	
	
	public static void main(String[] args) {
		Programmer pg = new Programmer();
		System.out.println(pg.bonus);
		System.out.println(pg.salary);
	}
}
