class GroceryStoreRunner{
	public static void main(String[] store)
	{
		
	GroceryStore.setShopName("vanitha stores");
	String nme=GroceryStore.getShopName();
	System.out.println("shop name is : "+nme);
	//-----------------------------
	
	GroceryStore.setAddress("Rajajinagar");
	String adrs=GroceryStore.getAddress();
	System.out.println("shop address is : "+adrs);
	//-----------------------------
GroceryStore.setMobileNo(8985674567l);
	long no=GroceryStore.getMobileNo();
	System.out.println("shop mobile no is : "+no);
	//-----------------------------

GroceryStore.setItemsAvailable(false);
	boolean avail=GroceryStore.getItemsAvailable();
	System.out.println("all items available or not : "+avail);
	//-----------------------------

		GroceryStore.setPlace("banglore");
	String pla=GroceryStore.getPlace();
	System.out.println("shop location is : "+pla);
	//-----------------------------
	GroceryStore.setNoOfEmployees(2);
	int no=GroceryStore.getNoOfEmployees();
	System.out.println("total no of employees are : "+no);
	//-----------------------------
	GroceryStore.setMontlyIncome(15000.00d);
	double inc=GroceryStore.getMontlyIncome();
	System.out.println("total monthly income is : "+inc);
	//-----------------------------
	GroceryStore.setMonthlyProfit(1000.00d);
	double pro=GroceryStore.getMonthlyProfit();
	System.out.println("total monthly profit is  : "+pro);
	//-----------------------------
		
	}



}