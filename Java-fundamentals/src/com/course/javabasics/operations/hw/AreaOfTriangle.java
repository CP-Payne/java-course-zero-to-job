package com.course.javabasics.operations.hw;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double triangleArea;
		double sideA;
		double sideB;
		double sideC;
		double p;
		
		System.out.print("Please, enter A side of a triangle: ");
		sideA = sc.nextDouble();
		
		System.out.print("Please, enter B side of a triangle: ");
		sideB = sc.nextDouble();
		
		System.out.print("Please, enter C side of a triangle: ");
		sideC = sc.nextDouble();
		
		p = (sideA + sideB + sideC)/2;
		
		triangleArea = Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC));

		System.out.println("Triangle area is: " + triangleArea);

	}

}
