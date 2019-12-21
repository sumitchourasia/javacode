package com.blz.calci;

public class Calculator {
	public static double power(int base, int exp) {
		double ans = 1;
		for (; exp > 0; exp--) {
			ans *= base;
		}
		return ans;
	}

	public static double add(int num1, int num2) {
		return num1 + num2;
	}

	public static double sub(int num1, int num2) {
		return num1 - num2;
	}

	public static double mul(int num1, int num2) {
		return num1 * num2;
	}

	public static double div(int num1, int num2) {
		return num1 / num2;
	}
}
