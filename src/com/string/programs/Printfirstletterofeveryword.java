package com.string.programs;

import java.util.Iterator;

public class Printfirstletterofeveryword {

	public static void main(String[] args) {
		String S = "geeks for geeks";
		String out = firstAlphabet(S);
		System.out.println(out);
		
	}
	
	static String firstAlphabet(String S)
	{
		String output = "";
		String[] finalString = S.split(" ");
		for (String string : finalString) {
			 output = output.concat(string.substring(0,1));
		}
		return output;
	    
	}
}
