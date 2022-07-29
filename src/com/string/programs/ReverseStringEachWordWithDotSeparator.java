package com.string.programs;

import java.util.Arrays;
/*
 * Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
 * */
public class ReverseStringEachWordWithDotSeparator {
	public static void main(String[] args) {
		String S = "i.like.this.program.very.much";
		String[] stringarray = S.split("\\.");
		System.out.println("Array Of String created with Dot as a Separator" + Arrays.toString(stringarray));
		StringBuilder output = new StringBuilder();
		for (int i = stringarray.length - 1; i >= 0; i--) {
			if(i > 0)
			output.append(stringarray[i]).append(".");
			else
			output.append(stringarray[i]);
		}
		System.out.println(output);
	}
}
