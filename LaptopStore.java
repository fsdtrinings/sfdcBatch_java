

class LaptopStore
{
     public static void main(String args[])
	 {
		Laptop dell = new Laptop();
		Laptop hp = new Laptop();
		
		
		dell.setCost(50000,10);
		hp.setCost(60000,0);
		
		
		
		System.out.println("Dell cost :-  "+dell.getCost());
		System.out.println("HP cost :-  "+hp.getCost());
		
	 
	 }//end of main

}//end of class