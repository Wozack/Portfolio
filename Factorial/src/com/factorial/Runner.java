package com.factorial;

public class Runner {

	public static void main(String[] args) {

		factorial(365);
	}

	public static int factorial(int i) {

		int count = 0;

		for (; i > 0; i--) {
			count *= i;
		}
		return count;
	}
}
