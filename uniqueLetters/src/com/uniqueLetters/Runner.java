package com.uniqueLetters;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(uniqueLetters("Hello all of you"));
	}

	public static String uniqueLetters(String s) {

		return Arrays.asList(s.split("")).stream().distinct().collect(Collectors.joining(""));
	}
}