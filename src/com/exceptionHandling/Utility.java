package com.exceptionHandling;

public class Utility {
	// declaring exception
 public boolean validateEmail(String email) throws Exception{
	 if(email==null)
	 {
		 throw new Exception("Email value cna't be null");
	 }
	 if( !email.contains("@"))
	 {
		 throw new Exception("Email must have @ ");
	 }
	 if(!email.contains(".") || email.indexOf('.')<(email.indexOf('@')+2) )
		 throw new Exception(" invalid email...");
	 return true;
 }
}
