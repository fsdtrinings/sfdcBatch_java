package entity;

public class Employee {

	private int empId;
	private String empName;
	private String email;
	private int salary;
	private Project p;

	public Employee() {
		
	}
	
	public Employee(int empId, String empName, String email) {
		
		this.empId = empId;
		this.empName = empName;
		this.email = email;
	}

	public Employee(int empId, String empName, String email, Project p) {
		
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.p = p;
	}

	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Project getP() {
		return p;
	}

	public void setP(Project p) {
		this.p = p;
	}

	
	public String toString() {
		return empId+" "+empName+" "+email+" "+p.getId()+" "+p.getProjectName();
	}
	
	
	
	
}













