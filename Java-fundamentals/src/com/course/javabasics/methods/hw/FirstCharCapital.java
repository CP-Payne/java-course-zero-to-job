package com.course.javabasics.methods.hw;


import java.util.Scanner;

public class FirstCharCapital {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		
		System.out.println(firstCharToTitleCase(userInput));
	}

	public static String firstCharToTitleCase(String string) {
		char[] charArray = string.toLowerCase().toCharArray();
		boolean found = false;
		
		for (int x = 0; x < charArray.length; x++) {
			if (!found && Character.isLetter(charArray[x])) {
				charArray[x] = Character.toUpperCase(charArray[x]);
				found = true;
			} else if (Character.isWhitespace(charArray[x])) {
				found=false;
			}
		}
		return String.valueOf(charArray);
	}
}