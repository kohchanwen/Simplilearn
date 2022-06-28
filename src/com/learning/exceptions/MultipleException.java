package com.learning.exceptions;

public class MultipleException {
    
	public static void readFile() {
		try {
		  Class.forName("com.learning.exceptions._01_Exceptions_Demo");
		  
		  int b = 12/45;
		} catch (ClassNotFoundException | ArithmeticException e) {
		  System.out.println("Something went wrong");
		}
	}
	public static void main(String[] args) {
		readFile();
 
	}

}
