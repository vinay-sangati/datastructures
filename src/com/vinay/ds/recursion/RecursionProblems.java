package com.vinay.ds.recursion;

public class RecursionProblems {
public static int adddigits(int number) {
	return number < 10 ? number :  number%10 + adddigits(number/10);
}
public static int power(int base,int power) {
	return power == 1 ? base : base * power(base,power-1);
}

public static String binaryOut(int n) {
	return n==1 ? "a" : binaryOut(n/2)+""+n%2;
}

public static int arrayProd(int[] arr,int remaining) {
	return remaining == 1 ? arr[remaining] :
		arr[remaining] * arrayProd(arr,remaining-1);
}

public static String reverse(String val) {
	return val.length() == 1 ? val : reverse(val.substring(1)) + val.substring(0,1);
	
}
public static int factorial(int val) {
	return (val == 0 || val == 1) ? 1:val * factorial(val - 1);
}

public static int fibonacci(int n) {
	return (n == 0 || n== 1) ?  n :  fibonacci(n-1)+fibonacci(n-2);
}
public static boolean isPallendrome(String val) {
	
	return val.length() == 1 ? true :
		val.length() == 2 ? val.charAt(0) == val.charAt(1)  ? true : false:
		val.charAt(0) == val.charAt(val.length()-1) ?
	isPallendrome(val.substring(1, val.length()-1)) : 
		false;
	
}
}
