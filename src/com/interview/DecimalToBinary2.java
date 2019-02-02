package com.interview;

public class DecimalToBinary2 {

	public static void main(String[] args) 
	{
		int no = 13;
		
		// Using StringBuilder
		StringBuilder result = new StringBuilder();
	    while (no > 0)
	    {
	        result.append(no%2);
	        no = no/2;
	    }
	    System.out.println(result.reverse());
		    
	}

}
