class SportsRunner{
	public static void main(String[]sports)
	{
		
	String[] playersName={"sehwag","kohli","gangooli","dravid","dhawan","raina","jadeja"};
	    Sports.cricketTeamMembers(playersName);
		
		int[] jersy={25,34,67,98,90,34,21};
		Sports.kabaddiTeamMembersJerseyNumbers(jersy);
		 double[] salary={50,78,90,67,89,57,98};
		 Sports.footBallTeamMembersSalary(salary);
		 
		 long[] numbers={9100703797l,9986812821l,9380311522l,7306987576l,9963862731l,9703554225l};
		 Sports.ludoTeamMobileNumbers(numbers);
		 
		 		 long[] pin={515001l,99868l,9380311l,730698l,996386l,970355l};
				 Sports.kokoTeamMembersCountryCode(pin);
				  int[]playedMatches={69,45,98,80,45,37};
				  Sports.hockeyTeamMembersNoOfMatches(playedMatches);
				  
				  boolean[] check1={true,false,false,true,true,true,true,false};
				  
              Sports.lagoriTeamMembersAlive(check1);
		 
		
	}


}