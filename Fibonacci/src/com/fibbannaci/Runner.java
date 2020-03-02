package com.fibbannaci;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		
		System.out.println(recursiveFib(25));
		System.out.println(fib(40));
		}



	public static Integer fib(int num) {

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(0);
		list1.add(1);

		for (int i = 1; i <= num; i++) {

			int answer = 0;

			answer = (list1.get(i)) + (list1.get(i - 1));

			list1.add(answer);

		}
		return list1.get(num);
	}

	public static  int recursiveFib(int num) {

		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		}

		return recursiveFib(num - 1) + recursiveFib(num - 2);
	}
}
