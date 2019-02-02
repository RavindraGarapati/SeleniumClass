package com.java.numbers;


public class Fibonacci {

	public static void main(String[] args)
	{
		int fib1 = 1, fib2 = 1, fibonacci = 0;
		int N = 10;
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i=1; i<= N-2; i++)
		{
			fibonacci = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibonacci;
			System.out.println(fibonacci);
		}
			
	}

}
