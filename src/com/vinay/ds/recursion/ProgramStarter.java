package com.vinay.ds.recursion;

public class ProgramStarter {
	
	static int factorial(int val) {
		return (val == 0 || val == 1) ? 1:val * factorial(val - 1);
	}
	
	static int fibonacci(int n) {
		return (n == 0 || n== 1) ?  n :  fibonacci(n-1)+fibonacci(n-2);
	}
	
public static void main(String[] args) {
	System.out.println(factorial(10));
	System.out.println(fibonacci(10));
	System.out.println(RecursionProblems.adddigits(12345));
	System.out.println(RecursionProblems.power(4,3));
	System.out.println(RecursionProblems.binaryOut(1000));
	int[] a = {1,2,3,4,5};
	System.out.println(RecursionProblems.arrayProd(a,4));
	
}
}






