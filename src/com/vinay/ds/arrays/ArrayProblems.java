package com.vinay.ds.arrays;

public class ArrayProblems {
	
	
	public static int[] topscore(int[] arr) {
		int[] ret = new int[3];
		// assuming 
		for(int i=0;i < arr.length;i++) {
			if(ret[0] < arr[i]) {
				ret[2] = ret[1];
				ret[1] = ret[0];
				ret[0] = arr[i];
			}  else if(ret[1] < arr[i]) {
					  ret[2] = ret[1];
					  ret[1] = arr[i]; }
				  else if(ret[2] < arr[i]) {
				  ret[2] = arr[i]; }
				 
			
		}
		
		return ret;
	}
	
	public static int diagnalSum(int[][] arr) {
		int sum=0;
		for(int i=0;i < arr.length;i++) {
			sum += arr[i][i];
		}
		return sum;
	}
	
	
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
