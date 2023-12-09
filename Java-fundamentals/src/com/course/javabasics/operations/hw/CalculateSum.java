package com.course.javabasics.operations.hw;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int input1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int input2 = sc.nextInt();
		int sum;
		
		sum = input1 + input2;
		
		System.out.println("The Sum of the numbers are: " + sum);
		
	}

}
