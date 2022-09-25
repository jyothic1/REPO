class ToothPasteRunner{
	public static void main(String[] brushmadro){
		Toothpaste.setName("patanjali");
	String toothpastename=Toothpaste.getName();
	System.out.println("name is : "+toothpastename);
	//-----------------------------------------------
	Toothpaste.setQuantity(1);
	  int  toothpastequantity=Toothpaste.getQuantity(); 
	  System.out.println("quantity is : "+toothpastequantity);
	  //-----------------------------------
	  	Toothpaste.setPrice(10);
	double toothpasteprice=	Toothpaste.getPrice();
  System.out.println("price is : "+toothpasteprice+" RS");
  //------------------------------------------------
    	Toothpaste.setWeight(100d);
		double toothpasteweight=Toothpaste.getWeight();
		  System.out.println("weight is : "+toothpasteweight+" mg");
		  //------------------------------------------
		  
		  	Toothpaste.setBarcodeNo(890410944680l);
				double toothpastebarcodeno=	Toothpaste.getBarcodeNo();
		  System.out.println("barcode number  is : "+toothpastebarcodeno);
		  //------------------------------------------
		  Toothpaste.setMfd("11/21");
				String toothpastemfdate=	Toothpaste.getMfd();
		  System.out.println("mfd is : "+toothpastemfdate);
		  //------------------------------------
		  
		Toothpaste.setExpiry("11/23");
				String toothpasteexpirydate=	Toothpaste.getExpiry();
		  System.out.println("expiry date is : "+toothpasteexpirydate);
		  //------------------------------------
		  
		Toothpaste.setType("ayurvedic");
				String toothpastetype=	Toothpaste.getType();
		  System.out.println("type of paste is : "+toothpastetype);
		  //-------------------------------
		  
		  	Toothpaste.setCustomerCareNo(1800916249l);
				long customercareno =	Toothpaste.getCustomerCareNo();
		  System.out.println("customer care number is : "+customercareno);
		  //-------------------------------
		   	Toothpaste.setCompanyEmailId("feedback@patanjaliayurved.org");
				String toothpastetypecompanyemailid =	Toothpaste.getCompanyEmailId();
		  System.out.println("company email id is : "+toothpastetypecompanyemailid);
		  //-------------------------------
		  
		  	Toothpaste.setBatchNo("AALJ445");
				String toothpastebatchno =	Toothpaste.getBatchNo();
		  System.out.println("tooth paste batch no is : "+toothpastebatchno);
		  //-------------------------------
		  
		  
		  	Toothpaste.setColor("blue");
				String toothpastecolor =Toothpaste.getColor();
		  System.out.println("tooth paste color is : "+toothpastecolor);
		  	  
	}

}
