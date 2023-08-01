package etc;

import java.util.Scanner;

import entity.Laptop;


/* class executes by user (store owner)*/
public class DemoClass {

	/*
	 *  2 Objects ]
	 *  
	 *  1st : default : all values are null or 0
	 *  2nd : paramenterized : only id & brandName is Set other values are 0 or null
	 * 
	 * other values we are setting through setter method
	 * 
	 * */
	
	public static void main(String[] args) {
		
		
		DemoClass app = new DemoClass(); // object just use to call non-static methods
		Scanner sc = new Scanner(System.in);  // use to take user input
		
		//---------- Object 1 (default) -----------------
		 
		Laptop dell = new Laptop();
	
		System.out.println(" Enter Details for Laptop 1");
		
		System.out.println("Enter Brand Name ");
		String brandName = sc.nextLine(); // using nextLine for String input
		dell.setBrandName(brandName);
		
		System.out.println("Enter Cost of  "+dell.getBrandName()+" Laptop");
		int cost = Integer.parseInt(sc.nextLine()); // using nextLine for String input
		dell.setCost(cost);
		
		System.out.println("Enter RamSize of  "+dell.getBrandName()+" Laptop");
		int ram = Integer.parseInt(sc.nextLine()); // using nextLine for String input
		dell.setRamSize(ram);
		
		System.out.println("Enter Hard Disk of  "+dell.getBrandName()+" Laptop");
		int hdd = Integer.parseInt(sc.nextLine()); // using nextLine for String input
		dell.setHdd(hdd);
		
		dell.setProductId(101);
		
		app.printLaptopDetails(dell);	
		
		
		
		//---------- Object 2 (Parameterized) -----------------
		//System.out.println("Press Enter for Next Laptop ");
		//sc.next(); // just press enter for next insertion
		
		Laptop hp = new Laptop(102,"HP");
		
		System.out.println("Enter Cost of  "+hp.getBrandName()+" Laptop");
		cost = Integer.parseInt(sc.nextLine()); 
		hp.setCost(cost);
		
		System.out.println("Enter RamSize of  "+hp.getBrandName()+" Laptop");
		ram = Integer.parseInt(sc.nextLine()); // using nextLine for String input
		hp.setRamSize(ram);
		
		System.out.println("Enter Hard Disk of  "+hp.getBrandName()+" Laptop");
		 hdd = Integer.parseInt(sc.nextLine()); // using nextLine for String input
		hp.setHdd(hdd);
		
		
		app.printLaptopDetails(hp);	
		
		
		
	}
	
	
	
	
	public void printLaptopDetails(Laptop laptop)
	{
		System.out.println("\n ---- Laptop Details -------\n");
		System.out.println("Laptop BrandName "+laptop.getBrandName());
		System.out.println("Laptop Cost "+laptop.getCost());
		System.out.println("Laptop RamSize : "+laptop.getRamSize()+" & HDD  "+laptop.getHdd());
		System.out.println("Laptop Id "+laptop.getProductId());
		System.out.println("\n\n");
	}
}
