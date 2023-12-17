package com.course.javabasics.controlstatements.loops.hw;

public class PrintMatrixToConsole {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10}
		};
		
		for (int[] arr : matrix) {
			for (int num : arr) {
				System.out.print(num + "\t");
				
			}
			System.out.println("\n");
		}
		
		
		// Alternative From Video
		
		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
