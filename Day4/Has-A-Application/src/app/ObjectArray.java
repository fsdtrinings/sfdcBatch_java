package app;

import java.util.Scanner;

import entity.Employee;
import entity.Project;

public class ObjectArray {
	
	public static void main(String[] args) {
		
		ObjectArray obj = new ObjectArray();
		
		
		Project p1 = new Project(701, "MyBankingApp", "USA-Bank");
		Project p2 = new Project(702, "MyApp", "India-ICICI");
		Project p3 = new Project(703, "MySocialApp", "Singapore");
		Project p4 = new Project(704,"ABC-GameApp","Pune");
		
		
		Employee e1 = new Employee(101, "Ramesh", "ramesh@gmail.com");
		e1.setP(p1);
		Employee e2 = new Employee(102, "Suresh", "Suresh@outlook.com");
		e2.setP(p3);
		Employee e3 = new Employee(103, "Mahesh", "mahesh@yahoo.com");
		e3.setP(p1);
		Employee e4 = new Employee(104, "Rakesh", "rakesh@gmail.com");
		e4.setP(p2);
		Employee e5 = new Employee(105, "Neha", "neha@yahoo.com");
		Employee e6 = new Employee(106, "Kavita", "kavita@linkedIn.com");
		
		
		
		Employee allEmployees[] = {e1,e2,e3,e4,e5,e6};
		
		System.out.println("Enter the Project Id to be Searched for :- ");
		obj.getEmployeesBasedOnProjectId(allEmployees, new Scanner(System.in).nextInt());
	}//end of main
	
	
	public void getEmployeesBasedOnProjectId(Employee[] allEmployees,int searchProjectid)
	{
		boolean isFound = false;
		for (Employee employee : allEmployees) {
			if(employee.getP().getId() == searchProjectid)
			{
				isFound = true;
				System.out.println(employee);
			}
		}
		
		if(isFound == false)
		{
			System.out.println("No Employee found for Project "+searchProjectid);
		}
	}
	
	public void getEmployeesBasedOnDomainName(Employee[] allEmployees,String searchDomin)
	{
		 // hint : search for String method endsWith(" ")
		boolean isFound = false;
		for(Employee employee:allEmployees)
		{
			if(employee.getEmail().endsWith(searchDomin))  // contains
			{
				isFound  = true;
				System.out.println(employee);
			}
		}
		
		if(isFound == false)
		{
			System.out.println(" We do not have any employee under this domain");
		}
	}
	
	
	public void getEmployeesWithNoProject(Employee[] allEmployees)
	{
		// if no project is associated them p value = null 
		
		System.out.println("Employees with no project are");
		for(Employee employee:allEmployees)
		{
			if(employee.getP()==null)
				System.out.println(employee);
				
		}
		
	}
	
	public void allocateProject(Employee[] allEmployees, Project newProject)
	{
		/* allocate Project to all employees works for Project 701 and Project == null*/
		
		
	}
	
	
	
	
	

}//end of class














