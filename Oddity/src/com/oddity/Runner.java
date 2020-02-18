package com.oddity;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
	
		System.out.println(oddity(new int[] {0,1,2,3,4,5,6,7}));
	}
		static List<Integer> oddity(int[] nums) {
			
			List<Integer> odds = new ArrayList();
			
			for(int num:nums) {
				if(num%2!=0);
				odds.add(num);
			}
		return odds;
	}
	
}
