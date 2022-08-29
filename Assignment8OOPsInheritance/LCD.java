package Assignment8OOPsInheritance;
/**
 * 
 * @author mayuri.narwade
 *
 */
/*
 * Perform the following Inheritance map and print the details of each objects.
 * Electronics Mobile LCD Laptop Electornics class :- id, semiconductorType,
 * dateOfManufacturing. Mobile, LCD and Laptop will inherit class electronics,
 * you have to create object of Electronic class and instantiate with Mobile,
 * LCD and Laptop class. And print the details accordingly.
 */
public class LCD extends Electronic {

	
	public static void main(String[] args) {
		Electronic el = new Electronic();
		System.out.println("This is Implimentation from LCD class");
		el.EleMethod(113, "SM3", "26/9/2002");
	}
}
