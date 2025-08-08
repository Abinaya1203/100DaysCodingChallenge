package com.array;

public class RightRotate {

	    public static void main(String[] args) {
	        int[] arr = {1,2,3,4,5,6,7,8,9,10};
	        int n = 3; 
	        int len = arr.length;
	        for (int r = 0; r < n; r++) {
	            int last = arr[len - 1];
	            for (int i = len - 1; i > 0; i--) {
	                arr[i] = arr[i - 1];
	            }
	            arr[0] = last;
	        }
	        for (int val : arr) {
	            System.out.print(val + " ");
	        }
	    }
	}