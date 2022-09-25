
class ParsingRunner{
	public static void main(String[]product)
	{
		
		System.out.println("no of elements is : "+product.length);
		
		
	String name=product[0];
	String type=product[1];
	String price=product[2];
	String quantity=product[3];
	String quality=product[4];
	
	System.out.println("name of the product is  : "+name);
	System.out.println("type of the product is : "+type);

	System.out.println("price of the product is "+price);

	System.out.println("quantity of the product is "+quantity);

	System.out.println("quality of the product is"+quality);
	
	
	           

//int---Integer---wrapper class
//short---Short---wrapper class
//byte----Byte-----wrapper class
//long---Long-----wrapper class
//char----Character-----wrapper class
//boolean----Boolean-----wrapper class
//double----Double-----wrapper class
//float----Float-----wrapper class
//
// so here all the values will be consider as a string 
//so while fetching we need to store it in a string data type 
//and wehave to use wrapper classes to parse 	
		
		
int convertedprice=Integer.parseInt(price);
int convertedquantity=Integer.parseInt(quantity);
boolean convertedquality=Boolean.parseBoolean(quality);
		
		System.out.println("converted price is : "+convertedprice);
		System.out.println("converted quantity is : "+convertedquantity);
		System.out.println("converted quality is : "+convertedquality);
	
if( convertedquantity>0&&convertedprice>0)
{
	
	int totalprice=convertedprice*convertedquantity;
	
		System.out.println("total price of :" +convertedquantity+ " products is : "+totalprice);
}
	
		
		
		
		
	}
}