package arrayAssign;

import java.util.Arrays;

public class RemoveNonPalindromeString {


	public static void main(String[] args) {
		
		String array[]= {"apple","mom","radar","banana"};
		
		for(int i=0;i<array.length;i++) {
		char ch[]=array[i].toCharArray();
		char temp[]=new char[ch.length];
		int l=0;
			for(int j=ch.length-1;j>=0;j--) {
				temp[l]=ch[j];
				l++;
			}
		
			if(Arrays.equals(ch, temp)) {
			System.out.println(temp);
			}
	}
	}

	
}
