package com.array.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

public class MaxAndMinIntegers {
	public static void main(String[] args) {
		//Using Int Array
		int arr[] = { 10, 324, 45, 90, 9808 };
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println("USING INT ARRAY");
		System.out.println("Largest in given array is " + max);
		System.out.println("Smallest in given array is " + min);
		
		//Using Int ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		
		OptionalInt maxInt = arrayList.stream().mapToInt(v -> v).max();
		OptionalInt minInt = arrayList.stream().mapToInt(v -> v).min();
		System.out.println("USING INT ARRAYLIST");
		System.out.println("Largest in given array is " + maxInt.getAsInt());
		System.out.println("Smallest in given array is " + minInt.getAsInt());
		
		
	}

}
