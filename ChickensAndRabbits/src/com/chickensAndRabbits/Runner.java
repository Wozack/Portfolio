package com.chickensAndRabbits;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		chickensAndRabbits(5,30);
	}

	public static void chickensAndRabbits(int heads, int legs) {
		
		int rabbit = (legs/2)-heads ;
		System.out.println("This many rabbits: " + rabbit);
		
		int chicken = heads-rabbit;
		System.out.println("This many chickens: " + chicken);
	}
	
	
}
