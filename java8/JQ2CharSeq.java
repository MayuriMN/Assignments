package com.yash.java8;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*WAP to check the given sequence of character in given string. Suppose 
that you are given following string “Taj is situated in Agra.” And you 
have to find following sequence AST. AST should be one after another. If 
you found sta, or tas, or tsa it should print string not found. */

public class JQ2CharSeq {

	 public static void main(String[] args) {
		 
		    String str="aaASTbbb";
		    
		   // String str ="TajAST situated in Agra";
			
		    //List<String> list =  Arrays.asList(str.split(" "));
		    
			int a = str.indexOf("A");
			int s = str.indexOf("S");
			int t = str.indexOf("T");
			
			
			if(a+1 == s && s+1 == t)
			{
				    System.out.println("AST String is found");
				}else
					{System.out.println("AST String is not found");}
			
		}
		
	

}
