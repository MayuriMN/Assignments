package com.yash.java8;

import java.util.Scanner;

public class JQ6StringPatterns {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String Pattern");
		String s = scan.next();

		for (int i = s.length() - 1; i >= s.length() / 2; i--) {
			System.out.print(s.charAt(i));

		}

	}

}
