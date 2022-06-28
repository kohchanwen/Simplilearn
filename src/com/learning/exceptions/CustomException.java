package com.learning.exceptions;

public class CustomException {
    
	static void validate(int salary) throws SalaryException{
		if(salary < 2100) {
			throw new SalaryException("you need to work hard");
		} 
		if(salary < 5000 && salary > 2100) {
			throw new SalaryException("your salary is somehow good");
		}
		if(salary > 5100 && salary < 9000) {
			throw new SalaryException("salary is very good");
		}
	}
	public static void main(String args[]) {
		try {
			validate(2000);
		} 
		catch(Exception e) {
			System.out.println("Exception occured:" + e.getMessage());
		}
		System.out.println("rest of the code");
	}
}

class SalaryException extends Exception{
	SalaryException(String s){
		super(s);
	}
}