package com.leetcode;

public class RemoveDuplicatesInPlace {
    public static void main(String[] args) {
        String str = "programming";
        char[] chars = str.toCharArray();
        int writeIndex = 0; 
        for (int i = 0; i < chars.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < writeIndex; j++) {
                if (chars[i] == chars[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                chars[writeIndex] = chars[i];
                writeIndex++;
            }
        }
        String result = new String(chars, 0, writeIndex);
        System.out.println("Original: " + str);
        System.out.println("Without Duplicates: " + result);
    }
}
