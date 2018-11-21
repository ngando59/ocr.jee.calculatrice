package com.ocr.beans;

public class Calculator {
	private int number1;
	private int number2;
	private char operator;
	
	public Calculator(int number1, int number2, char operator) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.operator = operator;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	public int result() throws ArithmeticException {
		int result = 0;
		switch(operator) {
			case '+' :
				return number1 + number2;
			case '-' :
				return number1 - number2;
			case '*' :
				return number1 * number2;
			case '/' :
				return number1 / number2;
			default :
				break;
		}
		return result;
	}
	
}
