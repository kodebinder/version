package com.company.logicalprograms.patterns;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		System.out.println("How many numbers");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
