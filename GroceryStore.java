class GroceryStore{
	static String shopname;
	static String shopaddress;
	static long shopmobileno;
	//String[] items={"rice","wheat","salt","eggs","oil","sauces"};
	static boolean allitemsavailable;
	static String area;
	static int  noofemployees;
	static double montlyincome;
	static double monthlyprofit;
	
	static void setShopName(String name)
	{
		shopname=name;
		
	}
	static String getShopName()
	{
		return shopname;
		
	}
	static void setAddress(String address)
	{
		shopaddress=address;
	}
	static String getAddress()
	{
		
		return shopaddress;
	}
	static void setMobileNo(long mobile)
	{
		shopmobileno=mobile;	
	}
	static long getMobileNo()
	{
		
		return shopmobileno;
		
	}
	static void setItemsAvailable(boolean available)
	{
		allitemsavailable=available;
	}
	static boolean getItemsAvailable()
	{
		
		return allitemsavailable;
	}
	static void setPlace(String place)
	{
		area=place;
	}
	static String getPlace()
	{
		return area;
		
	}
	static void setNoOfEmployees(int employees)
	{
		
		noofemployees=employees;
	}
	static int getNoOfEmployees()
	{
		
		return noofemployees;
	}
	static void setMontlyIncome(double income)
	{
		montlyincome=income;
		
	}
	static double getMontlyIncome()
	{
		return montlyincome;
	}
	static void setMonthlyProfit(double profit)
	{
		monthlyprofit=profit;
	}
	static double setMonthlyProfit()
	{
		return monthlyprofit;
	}
	
	
}
