package Assignment2OOPs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Logger;

public class Test {
	//logger
	static Logger logger = Logger.getLogger(Test.class.getName());
	
	public static void main(String[] args) throws ParseException {
		Department[] deptDepartments = new Department[2];
		deptDepartments[0] = new Department("Dept101", "Hr Department");
		deptDepartments[1] = new Department("Dept201", "It Department");

		String birthDate = "31/12/1993";
		Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);

		String joinDate = "22/7/2022";
		Date doj = new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);

		String regDate = "01/02/2022";
		Date dor = new SimpleDateFormat("dd/MM/yyyy").parse(regDate);

		Employee emp = new Employee(1, "Mayuri", "Ambegaon", dob, 800000.00, doj, "Pune", deptDepartments[1], 78945,
				"mayuri234511@gmail.com");

		Customer customer = new Customer(101, "mayuri", "Ambegaon", dob, dor, "Pune", 11450, "mayuri234511@gmail.com");

		//System.out.println("Employee Details");
		logger.info("Employee Details");
		emp.printEmployeeDetails();
		//System.out.println("\ncustomer Details");
		logger.info("\ncustomer Details");
		customer.printCustomerDetails();
		
		
	}
}
