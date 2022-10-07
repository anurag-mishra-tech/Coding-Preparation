package com.string.programs;

import java.util.Iterator;

public class MinimumIndexedCharacter {
	public static void main(String[] args) {
		//String str = "aspqqm";
		//String patt = "iqqncjohhgiyewtkbheknexxkyrzqhnbaeocpclyltwrrpcsygcokcnxcgysqmtqsjuhofhbadssvumvbpjnt";
		String str = "geeksforgeeks";
		String patt = "set";
		
		int out = minimumIndexedCharacter(str, patt);
		System.out.println(out);

	}

	static int minimumIndexedCharacter(String str, String patt) {
		// code here

		String[] strArr = str.split("");
		String[] strArr1 = patt.split("");
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr1.length; j++) {
				if (strArr[i].equals(strArr1[j])) {
					return str.indexOf(strArr[i]);
				}
			}
		}
		return -1;
	}
}
