package com.array.eg036.findtripletswithgivensum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayApp {

	public static List<List<Integer>> findTriplets(int[] arr, int targetSum) {
		Arrays.sort(arr);

		List<List<Integer>> allTriplets = new ArrayList<>();

		for (int i = 0; i < arr.length - 2; i++) {
			int sum = targetSum - arr[i];

			int start = i + 1;
			int end = arr.length - 1;

			while (start < end) {
				int t = arr[start] + arr[end];
				if (t == sum) {
					allTriplets.add(Arrays.asList(arr[start], arr[end], arr[i]));
					start++;
					end--;
				} else if (t < sum) {
					start++;
				} else {
					end--;
				}
			}
		}

		return allTriplets;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, -3, 4, -2, -1 };

		System.out.println(ArrayApp.findTriplets(arr, 1));
	}

}