class Travel{
	static double transport(String source,String destination){
		System.out.println("calculating distance");
		return 135.6;
		
	}
	static double transport(String source,String destination,boolean ontime)	
	{
		
		System.out.println("calculating distance and reached ontime");
		return 5.6;
	}
	static boolean transport(String destination)
	{
		
		System.out.println("destination is : "+destination);
		return true;
		
	}
	static boolean transport(String destination, boolean ontime)
	{
		
		System.out.println("destination is : "+destination+ "not reached");
		return false;
		
	}
	static boolean transport(boolean ontime)
	{
		
		System.out.println("yes reached");
		return true;
		
		
	}
	
	
}