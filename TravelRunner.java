class TravelRunner{

public static void main(String[]transport)
{
	double distance=Travel.transport("tumkur","sira");
	System.out.println("distance is : "  +distance);
	
	double time=Travel.transport("tumkur","sira",true);
	System.out.println("time taken to reach this place is : "+time+ " " +": hrs");
	
	boolean ref=Travel.transport("banglore");
	System.out.println(ref + "yes reached");
	
    boolean ref1=Travel.transport(true);
    System.out.println(ref1 +  "yes i too reached");

	boolean ref2=Travel.transport("banglore",false);
	System.out.println(ref2 + "not reached");
	
	
	

}
}