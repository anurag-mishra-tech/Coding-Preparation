package com.string.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumOccuringCharacter {
	private static final int ASCII_SIZE = 256;

	public static void main(String[] args) {
		String str = "orqxvbq";
		//String str = "abcdefabcdef";
		//String str = "testsample";
		char s = getMaxOccuringChar(str);
		System.out.println(s);
	}

	static char getMaxOccuringChar(String str) {
		
		char charArray[] = str.toCharArray();
	    Arrays.sort(charArray);
	    String string = new String(charArray);  
		int count[] = new int[ASCII_SIZE];

		// Construct character count array from the input
		// string.
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		int max = -1; // Initialize max count
		char result = ' '; // Initialize result 
		// Traversing through the string and maintaining
		// the count of each character
		for (int i = 0; i < len; i++) {
			if (max < count[string.charAt(i)]) {
				max = count[string.charAt(i)];
				result = string.charAt(i);
			}
		}
		return result;
	}
}
