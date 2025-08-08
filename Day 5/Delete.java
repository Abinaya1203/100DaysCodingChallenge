package com.array;

public class Delete {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        int index = 2; 
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}