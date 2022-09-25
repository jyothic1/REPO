class Toothpaste{
	static String name;
	static int quantity;
	 static double price;
	static double weight;
	static long barcodeNo;
static String mfd;
	static String expiry;
	static String type;
   static  long customercareno;
  static  String companyemailid;
   static  String batchNo;
  static String color;
   
   static void setName(String pastename){
	   name=pastename;
	     
   }
   static void setQuantity(int quant){
	   
	   quantity=quant;      
   }
   static void setPrice(double pasteprice){
	   
	   price=pasteprice;
	   
   }
   static void setWeight(double pasteweight){
	   
	   
	   weight=pasteweight;
	   
   }
   static void setBarcodeNo(long pastebarcodeno)
   {
	   
	   barcodeNo=pastebarcodeno;
   }
   static void setMfd(String pastemfd){
	   
	   mfd=pastemfd;   
   }
   static void setExpiry(String pasteexpirydate)
   {
	   expiry=pasteexpirydate;
	   
   }
   static void setType(String pastetype){
	   
	   type=pastetype;
	  
   }
   static void setCustomerCareNo(long compno){
	   customercareno=compno;
	   
   }
   static void setCompanyEmailId(String email){
	   
	   companyemailid=email;
	      
   }
   static void setBatchNo(String productbatchno)
   {
	   batchNo=productbatchno;
	   
   }
   static void setColor(String pastecolor)
   {
	   
	   color=pastecolor;
	   
   }
   static String getName(){
	   
	   
	  return name;
   }
   static int getQuantity()
   {
	   
	   return quantity;
   }
	static double getPrice(){
		
		return price;
	}
	static double getWeight(){
		return weight;
		
	}	
	static long getBarcodeNo(){
		
		return barcodeNo;
	}
	static String getMfd(){
	
      return mfd;
	}
	  static String getExpiry(){
		  return expiry;
		  
	  }
	  static String getType(){
		  
		  return type;
	  }
	  
	  static long getCustomerCareNo(){
		  
		  return customercareno;
	  }
	  
	  static String getCompanyEmailId(){
		  
		  return companyemailid;
	  }
	  static String getBatchNo(){
		  
		  return batchNo; 
	  }
	  static String getColor(){
		  
		  return color;
		  
	  }
	  
	  
}
