package app;

import entity.Employee;
import entity.Project;

public class MainClass {

	public static void main(String[] args) {
		
		Project p = new Project(701, "MyBankingApp", "USA-Bank");
		
		Employee e = new Employee(101, "Ramesh", "ramesh@gmail.com");
		e.setP(p);
		
		System.out.println("\n Printing e object :-  "+e);
		System.out.println("\n\n");
		
		System.out.println("Employee : - "+e.getEmpId()+" "+e.getEmpName()+" "+e.getEmail());
		System.out.println("Employee works for Project : - "+e.getP().getId());
		System.out.println(e.getP().getProjectName());
		System.out.println(e.getP().getLocation());
		
		
	}
	
	
}
