package com.vinay.ds.recursion;

public class ArrayProblems {
	
	
	
	public static int[][] rotategivento90(int[][] arr){
		
		int[][] arr2 = new int[arr.length][arr.length];
		for(int i=0; i< arr[0].length;i++) {
		for(int j=0; j< arr[0].length;j++) {
			arr2[i][j] = arr[(arr[0].length-1) - j][i]; 
		}
		}
		return arr2;
	}
	
	
	public static int[] pairsSum(int[] arr,int number) {
		// lets start with default way- unsorted array
		// for // for
		//
		
		
		return null;
	}
	
public static int getMissingNumber(int[] arr) {
	// there are other ways // have to come back later
	for(int i=0;i< arr.length;i++) {
		
		if(arr[i] != (i+1) ) {
			return (i+1);
		}
	}
	return -1;
}
}
