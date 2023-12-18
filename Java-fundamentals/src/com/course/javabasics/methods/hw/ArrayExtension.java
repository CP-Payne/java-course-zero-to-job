package com.course.javabasics.methods.hw;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArrayExtension {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter length of initial array: ");
		int baseArrayLength = sc.nextInt();
		int[] arr = generateRandomArray(baseArrayLength);
		int[] extendedArray = extendArray(arr);
		System.out.println("*** Initial array ***");
		System.out.println(Arrays.toString(arr));
		System.out.println("*** Extended array ***");
		System.out.println(Arrays.toString(extendedArray));
	}

	/**
	 * The method extends array.
	 * If array {1, 2, 3} has been passed to this method then array {1, 2, 3, 2, 4, 6}
	 * is returned from this method.
	 * 
	 * @param arr - base of extension. Extended array contains elements from this array
	 * and additionally contains the same elements multiplied by two. 
	 * @return extended array.
	 */
	public static int[] extendArray(int[] arr) {
		int arraySize = arr.length;
		int[] extendedArray = new int[arraySize*2];
		
		for (int x=0;x<extendedArray.length; x++) {
			if (x <= (extendedArray.length / 2) -1 ) {
				extendedArray[x] = arr[x];
			} else {
				extendedArray[x] = extendedArray[x-arraySize] * 2;
			}
		}
		
		return extendedArray;
		
	}

	public static int[] generateRandomArray(int amountOfElements) {
		int[] randomNumArray = new int[amountOfElements];
		Random r = new Random();
		
		for (int x = 0; x < amountOfElements; x++) {
			randomNumArray[x] = r.nextInt(100) + 1;
			
		}
		return randomNumArray;
	}


}
