package com.vinay.ds.recursion;

import java.util.Arrays;

public class Main_Method {
public static void main(String[] args) {
	/*
	 * Recursions
	 * int[] a = {1,2,3,4,5}; System.out.println(RecursionProblems.arrayProd(a,4));
	 * System.out.println(RecursionProblems.factorial(10));
	 * System.out.println(RecursionProblems.fibonacci(10));
	 * System.out.println(RecursionProblems.adddigits(12345));
	 * System.out.println(RecursionProblems.power(4,3));
	 * System.out.println(RecursionProblems.binaryOut(1000));
	 * System.out.println(RecursionProblems.reverse("LET"));
	 * System.out.println(RecursionProblems.isPallendrome("TJET"));
	 */
	// Arrays
	int[] arrnumber = {1,2,3,33,4,5,6,8,99,10};
	System.out.println(ArrayProblems.getMissingNumber(arrnumber));
	int[][] squarearray = {{1,2,3},{4,5,6},{7,8,9}};
	System.out.println(Arrays.deepToString(ArrayProblems.rotategivento90(squarearray)));
	System.out.println(ArrayProblems.diagnalSum(squarearray));
	System.out.println(Arrays.toString(ArrayProblems.topscore(arrnumber)));
}
}






