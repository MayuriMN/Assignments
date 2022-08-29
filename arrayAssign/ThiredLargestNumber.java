package arrayAssign;

public class ThiredLargestNumber {

	
	public static void main(String args[]){  
		int a[]={7,2,5,6,9,2};  
		int b[]={67,66,99,77,33,12,05};  
		System.out.println("Third Largest Number: "+TLargest(a,6));  
		System.out.println("Third Largest Number: "+TLargest(b,7));  
		}

		public static int TLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-3];  
		}  
		
}  
	

