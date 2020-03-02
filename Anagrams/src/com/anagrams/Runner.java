package com.anagrams;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(anagrams("Junk", "Unjk"));
	
	}

	static boolean anagrams(String a, String b) {
		
		a=a.toLowerCase().replace(" ", "");
		b=b.toLowerCase().replace(" ", "");
		
		char[] array1 = a.toCharArray();
		char[] array2 = b.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		System.out.println(array1);
		System.out.println(array2);
		return Arrays.equals(array1, array2);
		
		
	}
	
	
	
}
