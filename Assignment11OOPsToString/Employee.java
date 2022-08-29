package Assignment11OOPsToString;

//import java.util.Date;
/**
 * 
 * @author mayuri.narwade
 *
 */
/*
 * WAP to print the object of Employee class with the help of toString method.
 * Employee class fields :- empid, empname, empsalary, empaddress, emp_dob,
 * emp_doj. use Date class to store the date of birth(dob) and date of
 * joining(doj).
 */
public class Employee {
	
	public int empid;
	public String empname;
	public int empsalary;
	public String address;
	public String emp_dob;
	public String emp_doj;
	
	
	
	

	public Employee(int empid, String empname, int empsalary, String address, String emp_dob, String emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.address = address;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", address=" + address
				+ ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}

	public static void main(String[] args) {
	    Employee e = new Employee(112,"Neha SHarma",800000 ,"Ambegaon Pune","26/3/2022","24/6/2012");
		System.out.println(e.toString());
	}
	
}
