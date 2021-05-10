package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	static int NOPLAY = 0;
	static int LADDER = 1;
	static int SNAKE = 2;
	static int currentPosition = 0;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Program");

		while (true) {
			int move = checkIfMovingAheadOrBack();
			if (move > NOPLAY) {
				if (move == LADDER) {
					currentPosition += rollDice();
				} else
					currentPosition -= rollDice();
			}
			if (checkIfWon()) {
				break;
			}
		}
	}

	private static boolean checkIfWon() {
		System.out.println(currentPosition);
		if (currentPosition == 100)
			return true;
		else {
			if (currentPosition < 0) {
				currentPosition = 0;
			}
			return false;
		}
	}

	private static int checkIfMovingAheadOrBack() {
		Random randomGenerator = new Random();
		int randomValue = randomGenerator.nextInt(3);
		return randomValue;
	}

	static int rollDice() {
		Random randomGenerator = new Random();
		int diceValue = randomGenerator.nextInt(6) + 1;
		System.out.println(diceValue);
		return diceValue;

	}
}