package com.array;

public class SecondBiggest {
	public static void main(String[] args) {
		int[] arr= {3,15,78,45,22};
		int max=0;
		int smax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax&&smax!=max) {
				smax=arr[i];
			}
		}
		
	System.out.println("SecondBiggest is "+smax);
	}
}
	