package com.course.javabasics.string.hw;

import java.util.Formatter;

public class PINumberFormatting {

	public static void main(String[] args) {
	Formatter formatter = new Formatter();
		
	formatter.format("%,.1f",Math.PI);
	System.out.println(formatter);	
	
	formatter = new Formatter();
	formatter.format("%,.2f",Math.PI);
	System.out.println(formatter);	

	formatter = new Formatter();
	formatter.format("%,.3f",Math.PI);
	System.out.println(formatter);	
	
	
	formatter = new Formatter();
	formatter.format("%,.4f",Math.PI);
	System.out.println(formatter);	
	
	
	formatter = new Formatter();
	formatter.format("%,.5f",Math.PI);
	System.out.println(formatter);	

	// USING printf
	System.out.printf("%.1f%n", Math.PI);
	System.out.printf("%.2f%n", Math.PI);
	System.out.printf("%.3f%n", Math.PI);
	System.out.printf("%.4f%n", Math.PI);
	System.out.printf("%.5f%n", Math.PI);

	}

}
