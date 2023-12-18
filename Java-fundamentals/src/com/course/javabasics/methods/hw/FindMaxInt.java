package com.course.javabasics.methods.hw;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		String integers_input = sc.nextLine();
		String[] numberStrArray = integers_input.split(" ");
		int[] intArray = new int[numberStrArray.length];

		for (int x = 0; x < numberStrArray.length; x++) {
			intArray[x] = Integer.parseInt(numberStrArray[x]);
		}

		int maxInt = findMaxIntInArray(intArray);
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}

	public static int findMaxIntInArray(int[] intArray) {
		int maxNum = 0;
		for (int x = 0; x < intArray.length; x++) {
			if (intArray[x] >= maxNum) {
				maxNum = intArray[x];
			}

		}
		return maxNum;
	}

}
