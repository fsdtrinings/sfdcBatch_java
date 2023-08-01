package entity;

/*
  The rules related to Entity class (Java Bean/POJO)
  1. all properties have to marked as PRIVATE
  2. class have to be marked as PUBLIC
  3. default constructor is mandatory
  4. getter & setter methods of all properties are mandatory
  */



public class Laptop {

	private String brandName; // null
	private int cost; // 0
	private int ramSize; //0
	private int hdd;
	private int productId;
	
	public Laptop() {
	}
	
	public Laptop(int id,String brand) {
		productId = id;
		brandName = brand;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	
	
	
	
}//end class












