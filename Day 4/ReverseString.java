package com.array;

public class ReverseString {
		public static void main(String[] args) {
			String s="Hi I am Abinaya";
			String[] a=s.split(" ");
			for(int i=0;i<=a.length-1;i++) {
				String b=a[i];
				for(int j=b.length()-1;j>=0;j--) {
					System.out.print(b.charAt(j));
					
				}
				System.out.print(" ");
			}
		}
}