package com.leetcode;
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        int required = tMap.size(); 
        int formed = 0; 
        Map<Character, Integer> window = new HashMap<>();
        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (tMap.containsKey(c) && window.get(c).intValue() == tMap.get(c).intValue()) {
                formed++;
            }
            while (l <= r && formed == required) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    minStart = l;
                }
                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);
                if (tMap.containsKey(leftChar) && window.get(leftChar).intValue() < tMap.get(leftChar).intValue()) {
                    formed--;
                }
                l++;
            }
            r++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    } 
    }
