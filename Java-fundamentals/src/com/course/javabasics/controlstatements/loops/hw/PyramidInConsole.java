package com.course.javabasics.controlstatements.loops.hw;

import java.util.Scanner;

public class PyramidInConsole {

	public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = (height*2)-1;

		
		for (int x=0; x < height; x++) {
			for (int y = 0; y<=x; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
		for (int x=height-1; x >= 0; x--) {
					for (int y = 0; y<x; y++) {
						System.out.print("*");
					}
					System.out.print("\n");
					
		}
	// The Below example is from ChatGPT	
		
        int totalRows = width; // Total rows in the pattern

        // Print the pattern
        for (int i = 1; i <= totalRows; i++) {
            // Determine the number of stars for the current row
            int starsInRow = i <= (totalRows / 2) + 1 ? i : totalRows - i + 1;

            // Print stars for the current row
            for (int j = 1; j <= starsInRow; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
		

	}

}
