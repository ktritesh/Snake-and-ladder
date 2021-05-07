package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		//Variable
		int singlePlayer = 0;
		System.out.println("Single player at start position is : " +singlePlayer);
		
		//computation
        int roll = (int) (Math.random()*6) + 1;
        
        System.out.println("single player rolls the die which is : " + roll );

	}

}
