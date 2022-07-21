package com.array.programs;

import java.util.Arrays;

public class SumTwoIntegersEqualToK {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		Arrays.sort(arr);
		int n = arr.length;
		int k = 5;
		countPairsWithSumK(arr, n, k);
	}

	static void countPairsWithSumK(int arr[], int n, int k) {
		int count = 0;

		// Pick all elements one by one
		for (int i = 0; i < n; i++) {
			// See if there is a pair
			// of this picked element
			for (int j = i + 1; j < n; j++)
				if ((arr[i] + arr[j]) == k) {
					System.out.println("Pair with a given sum " + k + " is (" + arr[i] + ", " + arr[j] + ")");
					count++;
				}
		}
		System.out.println("Count of pairs with given sum is " + count);
	}
}
