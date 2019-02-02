package com.java.numbers;

import java.util.Scanner;

public class SumOfFirstNNaturalOddNumbers
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a namtural Number: ");
		int N=sc.nextInt();
		sc.close();

		int sum = 0;
		for(int i=1;i<=N;i++)
		{
			sum = sum + (2*i-1);
		}
		System.out.println(sum);
	}

}
