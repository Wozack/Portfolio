package com.pallendrome;

public class Runner {

	public static void main(String[]args) {
	
	System.out.println(pallendrome("borrow or rob"));
}	
	
	public static boolean pallendrome(String s) {

		String s1 = new String();

		for (int i = 0; i < s.length(); i++) {

			if (!(s.substring(i, i + 1).equals(" "))) {
				s1 += s.substring(i, i + 1);
			}
		}

		s1 = s1.toLowerCase();
		System.out.println(s1);
		
		String s2 = new String();

		for (int i = (s1.length()); i > 0; i--) {

			if (!(s1.substring(i-1, i).equals(" "))) {
				s2 += s1.substring(i-1, i);
			}
		}
		System.out.println(s2);
		return(s2.equals(s1));

		}
	}
