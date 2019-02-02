package com.java.numbers;

import java.util.Scanner;

public class FirstNEvenNumbers {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Numer: ");
		int N=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=N)
		{
			System.out.println(2*i+" ");
			i++;
		}

	}

}
