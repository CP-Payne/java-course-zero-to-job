package com.course.javabasics.methods.hw;

import java.util.Scanner;

public class FirstLetterOfEachWordCapital {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		
		System.out.println(firstCharToTitleCase(userInput));
	}

	public static String firstCharToTitleCase(String string) {
		string = string.toLowerCase();
		String[] stringArray = string.split(" ");
		
		for (int x=0; x<stringArray.length; x++) {
			stringArray[x] = stringArray[x].substring(0, 1).toUpperCase() + stringArray[x].substring(1);
		}
		
		
		return String.join(" ", stringArray);
	}

}
