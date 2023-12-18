package com.course.javabasics.methods.hw;

import java.util.Arrays;
import java.util.Scanner;

public class FilterStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));

	}
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		
		String filteredWords = new String();
		
		for (String string : words) {
			if (string.length() >= minLength) {
				filteredWords = filteredWords + string + " ";
			}
		}
		
		String[] filteredWordsArray = filteredWords.split("\\s+");
		

		return filteredWordsArray;
	}

}
