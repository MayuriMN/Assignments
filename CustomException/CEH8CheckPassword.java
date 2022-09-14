import java.util.Scanner;

public class CEH8CheckPassword {
	
	public static boolean CheckPassword(String password) throws PasswordFormatException
	{
		 // for checking if password length
        // is between 8 and 15
        if (!((password.length() >= 8)
              && (password.length() <= 15))) {
        	
            return false;
            
        }
 
        // to check space
        if (password.contains(" ")) {
            return false;
        }
        if (true) {
            int count = 0;
 
            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {
 
                // to convert int to string
                String str1 = Integer.toString(i);
 
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
 
        // for special characters
        if (!(password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("(")
              || password.contains(")") || password.contains("-")
              || password.contains("+") || password.contains("/")
              || password.contains(":") || password.contains(".")
              || password.contains(", ") || password.contains("<")
              || password.contains(">") || password.contains("?")
              || password.contains("|"))) {
         
        	return false;
        }
 
        if (true) {
            int count = 0;
 
            // checking capital letters
            for (int i = 65; i <= 90; i++) {
 
                // type casting
                char c = (char)i;
 
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
 
        if (true) {
            int count = 0;
 
            // checking small letters
            for (int i = 97; i <= 122; i++) {
 
                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);
 
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
       // throw new PasswordFormatException(password +"Exception throw here");
        // if all conditions fails
        return true;
    }
	    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Add your email address");
		String email = sc.next();
		System.out.println("Enter Password");
		String p = sc.next();
		
		
		try {
			if (CheckPassword(p)) {
			    System.out.println("Password is valid: " + p);
			} else {
			    System.out.println("Not a valid password: " + p);
			    throw new PasswordFormatException("Exception throw here");
			}
		} catch (PasswordFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception throw");
			e.printStackTrace();
		}
	}
	
}
