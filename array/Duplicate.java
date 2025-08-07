package com.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicate {

	public static void main(String[] args) {
		String s ="Repeated string";
		LinkedHashMap<Character,Integer>m=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(m.containsKey(ch)==true) {
				int r=m.get(ch);
				m.put(ch,r+1);
			}
			else {
				m.put(ch, 1);
			
			}}
		
		for(Map.Entry<Character,Integer>k:m.entrySet()) {
			char key=k.getKey();
			int val=k.getValue();
			if(val>1) {
			System.out.print(key+" ");
			}
		}
	}
}
