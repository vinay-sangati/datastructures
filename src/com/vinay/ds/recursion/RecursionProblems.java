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
	return remaining == 1 ? arr[remaining] : arr[remaining] * arrayProd(arr,remaining-1);
}
}
