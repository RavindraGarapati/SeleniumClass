package com.interview;

public class DecimalToBinary1 {

	public static void main(String[] args) 
	{
		int no = 13;
		
		// Using an array of int
		 int container[] = new int[100];
		    int i = 0;
		    while (no > 0)
		    {
		        container[i] = no%2;
		        i++;
		        no = no/2;
		    }
		    for (int j = i -1 ; j >= 0 ; j--)
		    {
		        System.out.print(container[j]);
		    }
		    
	}

}
