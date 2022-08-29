package Assignment4OOPsArea;

import java.util.Scanner;

public class Area {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Tringle");
		System.out.println("Press 2 for Reactangle");
		System.out.println("Press 3 for Square");
		System.out.println("Please enter your Choice");
		int ch =sc.nextInt();
		//1int a,b,c,d;
	   
		switch (ch) {
		case 1:
			   Scanner s= new Scanner(System.in);
		       //Taking the user input
		       System.out.println("Enter the length of the base of the Triangle:");
		       double b= s.nextDouble(); //Taking the user input
		       System.out.println("Enter the height of the Triangle:");
		       double h= s.nextDouble();
		       double area=(b*h)/2;// calculating the area using the formula
		       System.out.println("The area of Triangle is: " + area);   
			break;
			
		case 2:
			   Scanner s1= new Scanner(System.in);
		       //Taking the user input
		       System.out.println("Enter widhth of recatangle:");
		       double d= s1.nextDouble(); //Taking the user input
		       System.out.println("Enter height of reactangle:");
		       double e= s1.nextDouble();
		       double rarea=d*e;// calculating the area using the formula
		       System.out.println("The area of Reactangeangle is: " + rarea);   
			break;

		case 3:
			 Scanner s2= new Scanner(System.in);
		       //Taking the user input
		       System.out.println("Enter the side:");
		       double f= s2.nextDouble(); //Taking the user input		      
		       double sqr=(f*f*f*f);// calculating the area using the formula
		       System.out.println("The area of Squaree is: " + sqr);   			  
			break;
			
		default:
			break;
		}
		
		

	
	}
}
