package com.java.bootcamp.assignment;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
			
		Random random = new Random();
		int genratedNumber = random.nextInt(100) + 1;
		//System.out.println(genratedNumber);
		
		Scanner scanner = new Scanner(System.in);
		
		boolean gameResult = false;
		int maxChances = 5;
		int guessedNumber = 0;
		
		for(int i = 1; i <= maxChances; i++) {
			System.out.print("Pick a number between 1 and 100 : ");
			guessedNumber = scanner.nextInt();
			
			if(guessedNumber < 1 || guessedNumber > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				i--;
			} else if(guessedNumber < genratedNumber) {
				System.out.println("Please pick a higher number");
			} else if(guessedNumber > genratedNumber) {
				System.out.println("Please pick a lower number");
			}
			else
			{
				gameResult = true;
				break;
			}
			//System.out.println(i);
		}
		
		if(gameResult) {
			System.out.println("You win!");
		}else {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + genratedNumber);
		}
		
		scanner.close();
		
	}

}
