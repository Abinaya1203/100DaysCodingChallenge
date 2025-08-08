package com.array;

public class LeftRotate {

	    public static void main(String[] args) {
	        int[] arr = {1,2,3,4,5,6,7,8,9,10};
	        int n = 6;
	        int len = arr.length;
	        for (int r = 0; r < n; r++) {
	            int first = arr[0];
	            for (int i = 0; i < len - 1; i++) {
	                arr[i] = arr[i + 1];
	            }
	            arr[len - 1] = first;
	        }
	        for (int val : arr) {
	            System.out.print(val + " ");
	        }
	    }
	}