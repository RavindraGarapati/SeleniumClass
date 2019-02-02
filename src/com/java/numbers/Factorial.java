package com.java.numbers;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int f=1;
		while(n!=0)
		{
			f=f*n;
			n--;
		}
		System.out.println("Factorial is "+f);
	}

}
