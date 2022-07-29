package com.string.programs;

/*https://leetcode.com/problems/multiply-strings/solution/*/
public class Multiply2Strings {
	public static void main(String[] args) {
		String s1 = "33";
		String s2 = "2";
		String s3 = String.valueOf(Math.multiplyExact(Integer.valueOf(s1), Integer.valueOf(s2)));
		System.out.println(s3);
	}
}
