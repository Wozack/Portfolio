package com.finder;

public class Runner {

	public static void main(String[] args) {

		System.out.println(finder("finding", 3, 'n'));

	}

	public static boolean finder(String s, int i, char c) {

		return s.charAt(i-1)==c;

	}
}