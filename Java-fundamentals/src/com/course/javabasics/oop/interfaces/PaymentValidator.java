package com.course.javabasics.oop.interfaces;

public interface PaymentValidator {
	
	boolean validatePayment(PaymentData payment);
	
//	default void someDefaultMethod() {
//		System.out.println("This is another default method");
//	};
}
