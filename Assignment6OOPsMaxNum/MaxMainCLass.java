package Assignment6OOPsMaxNum;
/**
 * 
 * @author mayuri.narwade
 *
 */
/*
 * With the help of method overriding create two functions which will find the
 * maximum of 3 and 4 numbers. Also write one generic function which can find
 * maximum of N numbers.
 */
public class MaxMainCLass extends MaxNumMethOver{
	
	@Override
	public int Max(int a,int b,int c)
	{
		 System.out.println("largest Number is " +c);
		 return c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	}
	@Override
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
	
        public static void main(String[] args) {
	
        MaxMainCLass mm = new MaxMainCLass();
        mm.Max(12,21,22);
        mm.GenericMax();
        MaxNumMethOver mn = new MaxNumMethOver();
        mn.Max(10,30,40);
        mm.Max(60,30, 23,40);
        
        mn.GenericMax();
        }

}
