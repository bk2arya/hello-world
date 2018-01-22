package common;

public class Calculations {

	private double add(double a, double b) {
		return a+b;
	}
	
	private double subtract(double a, double b) {
		return a>b?a-b:b-a;
	}
	
	private double multiply(double a, double b) {
		return a*b;
	}
	
	private double divide(double a, double b) {
		return a>b?a/b:b/a;
	}
	
}
