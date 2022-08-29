package arrayAssign;

public class FindEvenOddPrime {

public static void main(String[] args) {
		
		int arr[]= {33,45,34,76,85,4};
		int evencount=0,oddcount=0;
		for(int i=0;i<arr.length;i++) {
		if ( arr[i]% 2 == 0) 
			evencount++;
        else
        	oddcount++;
		
		}
		System.out.println("Even count "+evencount+"\nOdd count "+oddcount);
	}
}

	

