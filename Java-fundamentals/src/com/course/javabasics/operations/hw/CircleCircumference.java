package com.course.javabasics.operations.hw;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double radius;
		double circleCircumference;
		
		System.out.print("Please, enter circle radius: ");
		radius = sc.nextDouble();
		
		circleCircumference = (2 * Math.PI * radius);
		

		System.out.println("Circle circumference is: " + circleCircumference);

	}

}
