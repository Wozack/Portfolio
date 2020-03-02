package com.fizzbuzz;

public class Runner {

	public static void main(String[] args) {
		
		
		System.out.println(fizzBuzz(36));	
	
			
	}
	static String fizzBuzz(int arg1) {
		
		String word = "";
		
		if(arg1 % 3 == 0) {
			word += "fizz";
		} 
		
	    if(arg1 % 5 == 0) {
			word += "buzz";
				
		}  
		
	    if(arg1 % 7 == 0) {
	    	word += "pop";
	    }
	     
	    if(arg1 % 9 == 0) {
	    	 word += "snap";
	    }
	     
	    return word;
		
		}

}
