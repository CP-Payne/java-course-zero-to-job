package com.course.javabasics.methods.hw;

import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String text = sc.nextLine();

		int amountOfWords = getWordsAmount(text);
	
		System.out.println("Amount of words in your text: " + amountOfWords);

	}
	
	public static int getWordsAmount(String text) {
		String[] stringArray = text.split("\\s+");
		
		int amountOfWords = stringArray.length;
		
		return amountOfWords;
	}

}
