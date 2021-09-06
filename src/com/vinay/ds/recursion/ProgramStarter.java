package com.vinay.ds.recursion;

public class ProgramStarter {
	
	static int factorial(int val) {// do remember to handle if negeative values are called
		// if val < 0 return -1 // because factorial is for positive integers
		return (val == 0 || val == 1) ? 1:val * factorial(val - 1);
	}
	
	static int fibonacci(int n) {
		return (n == 0 || n== 1) ?  n :  fibonacci(n-1)+fibonacci(n-2);
	}
	
public static void main(String[] args) {
	System.out.println(factorial(10));
	System.out.println(fibonacci(10));
}
}






