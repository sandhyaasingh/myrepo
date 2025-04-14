package com.tnsif.exception_handling;

public class TryCatchFinally {

	public static void main(String[] args) {
		// Syntax
		try {
			// code that may throw an exception
			int result = 10/3;
		}catch(Exception e) {
			// Handles the exception
			System.out.println("Caught an exception!!!" + e);	
		}finally {
			// This block always executes
			System.out.println("This is finally block!");
		}
		
	}

}

