package com.course.javabasics.enumerations.hw;

import java.util.Scanner;

import com.course.javabasics.enumerations.hw.Priority;

public class EnumExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please, enter message type to check it priority: ");
			String userInput = sc.next();

			if (isValidMessageType(userInput)) {
				Priority priority = Priority.valueOf(userInput);
				System.out.println(priority.getPriorityLevel());
				break;

			} else {
				System.out.println("Please, enter valid "
						+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
				continue;
			}

		}

	}

	private static boolean isValidMessageType(String userInput) {
		Priority[] values = Priority.values();
		
		boolean valueFound = false;
		
		for (Priority p: values) {
			if (p.toString().equals(userInput.toUpperCase())) {
				valueFound = true;
			}
		}
		return valueFound;
	}

}
