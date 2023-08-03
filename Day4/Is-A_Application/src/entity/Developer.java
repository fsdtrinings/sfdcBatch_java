package entity;

public class Developer extends Employee{
	
	Laptop laptop;
	boolean workFromHomeStatus;
	
	
	public Developer(int empId, String empName, String email,boolean workingStatus) {
		super(empId, empName, email);
		this.workFromHomeStatus = workingStatus;
		
	}

	
	
	public boolean isWorkFromHomeStatus() {
		return workFromHomeStatus;
	}



	public void setWorkFromHomeStatus(boolean workFromHomeStatus) {
		this.workFromHomeStatus = workFromHomeStatus;
	}



	public Laptop getLaptop() {
		return laptop;
	}
	
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void doCoding()
	{
		System.out.println(""+super.getEmpName()+" is doing javacoding");
	}



	@Override
	public String toString() {
		return "Developer [Issued laptop=" + laptop.getProductId() + ", workFromHomeStatus=" + workFromHomeStatus + "] "+super.getEmpId()+" "+super.getEmail()+" "+super.getEmpName();
	}

	
}
