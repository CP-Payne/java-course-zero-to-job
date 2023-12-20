package com.course.javabasics.methods.hw;

public class StringProcessor {

	 public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
				"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
				"james;Derek James;james@gmail.com" + System.lineSeparator() +
				"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
				"gregory;Mike Gregory;gregory@yahoo.com";
		
		public static void main(String[] args) {
			System.out.println("===== Convert 1 demo =====");
			System.out.println(convert1(INPUT_DATA));
			
			System.out.println("===== Convert 2 demo =====");
			System.out.println(convert2(INPUT_DATA));
			
		}
		
		public static String convert1(String input) {
			
			String[][] inputArray = convertInputToArray(input);
			String processedOutput = new String();
			
			for (int r = 0; r < inputArray.length; r++) {
				processedOutput += inputArray[r][0] +" ==> " + inputArray[r][2] + System.lineSeparator();
			}
			
			
			return processedOutput;
		
		}
		

		
		
		public static String convert2(String input) {
			
			String[][] inputArray = convertInputToArray(input);
			String processedOutput = new String();
			
			for (int r = 0; r < inputArray.length; r++) {
				processedOutput += inputArray[r][1] +" (email: " + inputArray[r][2] + ")" + System.lineSeparator();
			}
			
			
			return processedOutput;
		}
		
		public static String[][] convertInputToArray(String input) {
			String[] lines = input.split(System.lineSeparator());
			String[][] separatedString = new String[lines.length-1][3];
			
			
			for (int r=0; r<separatedString.length; r++) {
				String[] temp = lines[r+1].split("[;]+");
				for (int c = 0; c < 3; c++) {
					separatedString[r][c] = temp[c];
				}
				
			}
			
			return separatedString;
		}


}
