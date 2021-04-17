package com.exceptionHandling;

//import com.psl.training.exceptions.InvalidInoutRangeException;
//import com.psl.training.util.Utility;

public class TestUtility {
public static void main(String[] args) {
	
	
	Utility util=new Utility();
	
	try {
		System.out.println(" abc@persistent.com  ? is valid"+util.validateEmail("abc@persistent.com"));
//		System.out.println(" abc.persistent@com  ? is valid"+util.validateEmail("abc.persistent@com"));
		System.out.println(" persistent.com  ? is valid"+util.validateEmail("persistent.com"));
//		System.out.println(" abc@persistent  ? is valid"+util.validateEmail("abc@persistent"));
//		System.out.println(" null  ? is valid"+util.validateEmail(null));
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}finally{
		System.out.println(" testing email validity.....");
	}
	System.out.println(" End of main");
	  
	if(1==2)
		throw new InvalidInoutRangeException();
	
	
	// Right now InvalidInputException is a checked Exception
	// How can I create Unchecked Exceptions ?
	
	
}
}
