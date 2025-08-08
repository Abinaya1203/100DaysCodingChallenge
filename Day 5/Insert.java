package com.array;

public class Insert {
	public static void main(String[] args) {
		int[] arr= {23,56,34,55,22,33,99,67,87};
		int n= arr.length;
		int element=42;
		int index=4;
		int[] newArr = new int[n+1];
		for(int i=0;i<index;i++) {
			newArr[i]=arr[i];
		}
		newArr[index]=element;
		for(int i=0;i<n;i++) {
			newArr[i+1]=arr[i];
		}
	for(int i=0;i<newArr.length;i++)
		System.out.print(newArr[i]+" ");
	}

}
