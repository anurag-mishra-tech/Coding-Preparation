package com.array.programs;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateIntegerArray {
	public static void main(String[] args) {

		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arrayList.add(arr[i]);
				}
			}
		}
		
		int[] output = new int[arrayList.size()];
		for (int i = 0 ; i <  arrayList.size() ; i++) {
			output[i] = arrayList.get(i);
		}
		System.out.println(Arrays.toString(output));

	}
}