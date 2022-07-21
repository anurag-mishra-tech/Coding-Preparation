package com.string.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepaceAllSpecialCharInString {
	public static void main(String[] args) {
		String str = "Anurag$Mishra(^,";
		System.out.println("Before Replace : " + str);
		str = str.replaceAll("[^A-Za-z]", "");
		System.out.println("After Replace : " + str);

		String specialChar = "@#$&%!~";
		// Function Call
		onlySpecialCharacters(specialChar);
		String numbers = "1234";
		// Function Call
		onlyNumbers(numbers);
		String characters = "Anurag";
		// Function Call
		onlyCharacters(characters);
	}

	public static void onlySpecialCharacters(String str) {

		// Regex to check if a string contains
		// only special characters
		String regex = "[^a-zA-Z0-9]+";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the string is empty
		// then print No
		if (str == null) {
			System.out.println("No");
			return;
		}

		// Find match between given string
		// & regular expression
		Matcher m = p.matcher(str);

		// Print Yes If the string matches
		// with the Regex
		if (m.matches())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	public static void onlyNumbers(String str) {

		// Regex to check if a string contains
		// only special characters
		String regex = "[0-9]+";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the string is empty
		// then print No
		if (str == null) {
			System.out.println("No");
			return;
		}

		// Find match between given string
		// & regular expression
		Matcher m = p.matcher(str);

		// Print Yes If the string matches
		// with the Regex
		if (m.matches())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	public static void onlyCharacters(String str) {

		// Regex to check if a string contains
		// only special characters
		String regex = "[a-zA-Z]+";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the string is empty
		// then print No
		if (str == null) {
			System.out.println("No");
			return;
		}

		// Find match between given string
		// & regular expression
		Matcher m = p.matcher(str);

		// Print Yes If the string matches
		// with the Regex
		if (m.matches())
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
