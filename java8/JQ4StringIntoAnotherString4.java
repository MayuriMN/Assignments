package com.yash.java8;

import java.util.Arrays;
import java.util.List;

public class JQ4StringIntoAnotherString4 {
	
	public static void main(String[] args) {

		List<String> list = Arrays.asList("mayuri", "Narwade");


		StringBuilder sb = new StringBuilder();
		list.forEach(sb::append);
		// System.out.println(sb);
		System.out.println(sb.insert(3, "NN"));
		// String con = sb.toString();

		System.out.println(sb);
		}

}
