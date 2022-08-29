package Assignment6OOPsMaxNum;

import java.util.Scanner;

public class MaxNumMethOver {
	
	public int Max(int a,int b,int c)
	{
		 System.out.println("largest Number is " +c);
		 return c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	}
	
	
	public void Max(int a,int b,int c,int d)
	{
		 if(a > b)
	      {
	         if(a > c)
	         {
	            if(a > d)
	            {  
	               System.out.println("Largest of four numbers is: " + a);
	            }
	            else
	            {
	               System.out.println("Largest of four numbers is: " + d);
	            }
	         }
	      }
	      else if(b > c)
	      {
	         if(b > d)
	         {
	            System.out.println("Largest of four numbers is: " + b);
	         }
	         else
	         {
	            System.out.println("Largest of four numbers is: " + d);
	         }
	      }
	      else if(c > d)
	      {
	         System.out.println("Largest of four numbers is: " + c);
	      }
	      else
	      {
	         System.out.println("Largest of four numbers is: " + d);
	      }	
	}
	
	public void GenericMax()
	{
		int n, max;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of array:");
		for(int i = 0; i < n; i++)
		{
		a[i] = s.nextInt();
		}
		max = a[0];
		for(int i = 0; i < n; i++)
		{
		if(max < a[i])
		{
		max = a[i];
		}
		}
		System.out.println("Maximum value in the array is:"+max);
		}
	

}
