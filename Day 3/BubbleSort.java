package com.sort;

import java.util.Arrays;

public class BubbleSort {
	static void bubble(int[] arr,int n) {
		if(n==1) {
			return;
		}
		int count=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			count++;
			
		}
		}
		if(count==0) {
			return;
		}
		bubble(arr,n-1);
	}

	public static void main(String[] args) {
		int[] arr= {23,65,72,12,22};
		int n=arr.length;
		bubble(arr, n);
		System.out.println(Arrays.toString(arr));

	}

}
