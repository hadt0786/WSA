package com.Assignment26;

/**
 * Problem #26: Write a program to find sum of all integers greater than 100 and
 * less than 200 that are divisible by 7.
 */

public class SumOfIntegersFrom100to200 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 100; i < 201; i++) {
			if (i % 7 == 0)
				sum += i;
		}
		System.out.println(sum);

	}

}
