package com.string.programs;

public class MaxEvenStringLength {
	public static void main(String[] args) {
		String str = "Be not afraid of greatness, some are born great, some achieve greatness, and some have greatness thrust upon them.";

		String[] strArray = str.split(" ");
		
		int maxLength = 0;
		for (String str1 : strArray) {
			str1 = str1.replaceAll("[^A-Za-z0-9]", "");
			System.out.println("String : "+str1+ " "+str1.length());
			int length = str1.length();

			if (length % 2 == 0) {
				if (maxLength < length) {
					maxLength = length;
				}
			}
		}
		System.out.println("Max Even Length : "+maxLength);

	}
}
