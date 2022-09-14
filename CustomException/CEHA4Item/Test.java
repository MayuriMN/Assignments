package CEHA4Item;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test {

	  
	public static boolean CheckLimit(boolean result)
	{
		return result;
	}
	
	public static void main(String[] args) {
	
		Item i = new Item();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item Name ");
		 i.itemname = sc.next();
		 
		System.out.println("Enter Price ");
		i.price = sc.nextInt();
		
		System.out.println("Enter Maximum no of item can you buy ");
		i.maxitmcb = sc.nextInt();
	
        System.out.println("Total No of purchased Item ");
        int p =sc.nextInt();
        
        ItemBought ib = new ItemBought();
		
        System.out.println("What is the Quantity ");
        ib.itemqnt = sc.nextInt();
        
        
	    System.out.println("\n"+"Item Name : "+i.itemname +"\n"+
	    		           "Item Price : "+i.price +"\n"+   
	    		           "Maximum item can you Brought : "+i.maxitmcb +"\n"+
	    		           "Total No of purchased Item : "+p +"\n"+
	    		           "Item Quantity : "+ib.itemqnt +"\n");
	  
		
	    
	}
	}
 
