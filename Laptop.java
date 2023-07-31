

public class Laptop 
{
     int cost;
	 int ramSize;
	
	  public void setCost(int laptopCost,int discount)
	  {
		  
		  cost = laptopCost-(laptopCost*discount)/100;
	  }
	
	  public int getCost()
	  {
		  
		  // apply business objective
		  // logging 
		  // secuity 
		  // database 
		  return cost+1;
	  }
	

}




