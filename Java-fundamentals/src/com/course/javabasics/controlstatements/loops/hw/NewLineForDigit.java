package com.course.javabasics.controlstatements.loops.hw;

import java.util.Scanner;

public class NewLineForDigit {

	public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String digits = sc.next();
		char[] digits_array = digits.toCharArray();
		
		for (char digit : digits_array) {
			System.out.println(digit);
		}
	}

}
