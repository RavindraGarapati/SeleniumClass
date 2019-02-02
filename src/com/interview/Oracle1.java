package com.interview;

public class Oracle1 {
	public static void main(String[] args)
	{
		// Change the last but one value in given string
		String sGiven = "ad:df:dd:ss:adg:rd";
		String valueTobeInserted = "Ravi";
		
		String sNew = "";
		
		String[] sGivenArray = sGiven.split(":");
		int arraySize = sGivenArray.length;
		sGivenArray[arraySize-2] = valueTobeInserted;
		
		for(int i=0; i<arraySize; i++)
		{
			if(i == arraySize-1)
			{
				sNew = sNew+sGivenArray[i];
			}
			else
			{
				sNew = sNew+sGivenArray[i]+":";
			}
		}
		
		System.out.println(sGiven);
		System.out.println(sNew);
		 
		
		//If you want to the change first but one word, then reverse the "sGiven" using strinbuffer
		//and use the same above code

	}

}
