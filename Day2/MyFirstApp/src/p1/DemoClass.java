package p1;

public class DemoClass {

	public static void main(String[] args) {

		Laptop lap1 = new Laptop();
		
		lap1.setValues(2000, 101,"HP-101");

		System.out.println("Brand Name :- "+lap1.brandName);
		System.out.println("Cost :- "+lap1.cost);
		System.out.println("Id :- "+lap1.laptopId);
		
		
	}

}
