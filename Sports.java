class Sports{
	static void cricketTeamMembers(String[]names){
		System.out.println("Total number of players: "+names.length);
		for(int index=0;index<names.length;index++)
		{
			        String name=names[index];
					
				System.out.println("cricket Team members are :"+name);		
		}
		
		
	}
	static void kabaddiTeamMembersJerseyNumbers(int[]numbers)
	{
		System.out.println("Total number of players: "+numbers.length);
		
		for(int index=0;index<numbers.length;index++)
		{
			        int no=numbers[index];
					
				System.out.println("Team members are :"+no);		
		}
		
	}
	static void footBallTeamMembersSalary(double[]salaries)
	{
			System.out.println("Total number of players: "+salaries.length);
			for(int index=0;index<salaries.length;index++)
			{
				double sal=salaries[index];
				System.out.println("salary in lakhs :"+sal );
				
				
			}
		
	}
	static void ludoTeamMobileNumbers(long[]mobile){
		System.out.println("Total mobile numbers:"+mobile.length);
		for(int index=0;index<mobile.length;index++)
		{
			
			long numbers=mobile[index];
			System.out.println("Team members are :"+numbers);
			
			
	}}
		
		static void kokoTeamMembersCountryCode(long[] pincodes)
		{
			System.out.println("total no of country codes:" +pincodes.length);
			for(int index=0;index<pincodes.length;index++)
			{
				
			long pincode=pincodes[index];
			System.out.println("Team members are :"+pincode);
			
			}
		}
		
		static void hockeyTeamMembersNoOfMatches(int []matches){
			
			System.out.println("total no of country codes:"+matches.length);
			for(int index=0;index<matches.length;index++)
			{
				int noOfMatches=matches[index];
				System.out.println("Team members are :"+noOfMatches);
			}
			
		}
		
		static void lagoriTeamMembersAlive(boolean []check)
		{
			
			System.out.println("total no of country codes:"+check.length);
			for(int index=0;index<check.length;index++)
			{	
			boolean alive=	check[index];
			System.out.println("alive or not :"+alive);
			}
			
		}
		
	}
	
	


