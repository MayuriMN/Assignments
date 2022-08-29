package Assignment7OOPsStringCompr;

import java.util.Scanner;
/**
 * 
 * @author mayuri.narwade
 *
 */
/*
 * With the help of method overriding perform the string comparison. User will
 * input two string and your task is to compare both the string one alphabets at
 * a time.
 */
public class StringComparison {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plase Enter any Two Strings");
		String str1 =sc.next();
		String str2 = sc.next();
		
		if(str1.compareTo(str2)==0) {
		System.out.println("Both string are equls ");
		}else {
			System.out.println("Both string are not equal");
		}
		
	}

}
