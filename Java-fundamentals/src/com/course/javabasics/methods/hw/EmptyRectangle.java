package com.course.javabasics.methods.hw;

import java.util.Scanner;

public class EmptyRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
		for (int r=0; r<height; r++) {
			for (int c=0; c<width; c++) {
				if (r==0 || r==(height-1)) {
					System.out.print("*");
				} else if (c==0 || c==(width-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("\n");
		}
	}

}
