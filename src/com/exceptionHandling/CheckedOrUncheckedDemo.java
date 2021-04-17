package com.exceptionHandling;

public class CheckedOrUncheckedDemo {
	public static void main(String[] args)  {

		
		int x = 20, y = 0;

		// if(y==0){
		// try {
		// throw new Exception(); //forced by compiler there should be some one
		// to handle it
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// // throw new RuntimeException(); // compiler will not force you to
		// handle
		// }
		CheckedOrUncheckedDemo obj=new CheckedOrUncheckedDemo();
		try {
			obj.div(x, y);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println(" in finally block.....");
		}
		
		System.out.println(" Valid inputs go ahead.....");

	}

	int div(int x, int y) throws Exception {
		
		// Code with Exception handling
		
		/*int result=0;
		try{
			 result=x / y;
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}finally{
			System.out.println(" This line will get executed in all situations");
		}
		return result;*/
		
		// code with declaring exception
		
		if(y==0)
			throw new Exception(" divisor can't be zero");
		
		return x/y;
			
	}
}
