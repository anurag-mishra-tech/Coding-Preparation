package com.string.programs;

public class ReverseString {
	public static void main(String[] args) {
		// Way 1
		String str = "Anurag", nstr = "";
		char ch;

		System.out.println("Original word: " + str);

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			nstr = ch + nstr; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: Way 1 " + nstr);

		// Way 2 using String Builder
		String input = "Anurag";
		StringBuilder input1 = new StringBuilder();

		// append a string into StringBuilder input1
		input1.append(input);

		// reverse StringBuilder input1
		input1.reverse();

		// print reversed String
		System.out.println("Reversed word: Way 2 " + input1);

	}
}
