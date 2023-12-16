package com.course.javabasics.controlstatements.hw;

public class AdminGuestMode {

	public static void main(String[] args) {
		String arguments = "".join(" ", args);
		// Alternative way to join string
		// String inputArguments = String.join(",", args);
		
		if (arguments.contains("--guest") && arguments.contains("--admin")) {
			System.out.println("Please select either 'ADMIN' or 'GUEST' mode for this program");
		} else if (arguments.contains("--guest")) {
			System.out.println("Hello, Guest!");
		} else if (arguments.contains("--admin")) {
			System.out.println("Hello, Admin!");
		}
	}

}
