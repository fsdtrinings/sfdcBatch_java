package app;

import entity.Developer;
import entity.Laptop;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		Developer dev = new Developer(101,"Ramesh Kumar","ramesh@gmail.com",false);
		
		Laptop device1 = new Laptop(1245887,"Dell-123");
		dev.setLaptop(device1);
		
		System.out.println(dev);
		
		
		// SaleManager
		
		
	}
}
