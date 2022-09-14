package CEHStud;

import java.nio.InvalidMarkException;
import java.util.Scanner;

import ExceptionHandling.InsufficientCapacity;

public class StudentResult {
	  static int result;
      static int a,b,c,d,e;
      
       public static int  CalculateMarks(int result){
    	  Scanner sc = new Scanner(System.in);
 	   	  System.out.println("Enter Five Subjects Marks");
 	   	  int a = sc.nextInt();
 	   	  int b = sc.nextInt();
 	   	  int c = sc.nextInt();
 	   	  int d = sc.nextInt();
 	   	  int e = sc.nextInt();
 	   	  
    	   if(a==35 || b==35 || c==35 || d==35 || e==35) {
   	 		
 			  result = a+b+c+d+e/100;
      }
		return result;
       }
	  public static void MarksCustomException(int result) throws ResultException { 
		 	
		  if(result <= (40/100))
			 {
							
	           throw new ResultException("Student is Faild");
			 }else
			 {
				 System.out.println("Student is Passed ");
			 
	  }
		  }
	public static void main(String[] args) throws CheckSubjectCriteria {
		
		StudentResult sr = new StudentResult();
		sr.CalculateMarks(result);
		
   	
       try
       {
    	   
    	   MarksCustomException(result);
       }catch (ResultException re ) {
		// TODO: handle exception
    	   System.out.println("Cought the  Marks Exception "+re);
	}
		
	
	}
		
		
		
	
}
