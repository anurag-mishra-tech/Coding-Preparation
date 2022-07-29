package com.string.programs;

/*Remove Duplicates in String */
public class RemoveDuplicatesinString {
	public static void main(String[] args) {
		String S = "zvvo";
		StringBuilder output = new StringBuilder();
		String[] strArray = S.split("");
		for (String string : strArray) {
			if (!output.toString().contains(string))
			output.append(string);
		}
		System.out.println(output);
	}
}
