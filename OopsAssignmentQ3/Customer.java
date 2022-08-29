package OopsAssignmentQ3;

public class Customer extends Branch {

	 private int custId;
	 private int accountno;
	 private String customername;
	 private String cust_address;
	 private String cust_dob;
	 private String cust_account_opening_date;
	 private String Branch_obj;
	 
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getCust_dob() {
		return cust_dob;
	}
	public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}
	public String getCust_account_opening_date() {
		return cust_account_opening_date;
	}
	public void setCust_account_opening_date(String cust_account_opening_date) {
		this.cust_account_opening_date = cust_account_opening_date;
	}
	public String getBranch_obj() {
		return Branch_obj;
	}
	public void setBranch_obj(String branch_obj) {
		Branch_obj = branch_obj;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", accountno=" + accountno + ", customername=" + customername
				+ ", cust_address=" + cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date="
				+ cust_account_opening_date + ", Branch_obj=" + Branch_obj + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, int accountno, String customername, String cust_address, String cust_dob,
			String cust_account_opening_date, String branch_obj) {
		super();
		this.custId = custId;
		this.accountno = accountno;
		this.customername = customername;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;
		Branch_obj = branch_obj;
	}
	 
	 
	public void CustomerMethod(int custId, int accountno, String customername, String cust_address, String cust_dob,
			String cust_account_opening_date, String branch_obj)
	 {
		System.out.println("\n"+"CustomerId :" +custId+ "\n"+ "Account Number:"+accountno +"\n"+
				           "CustomerName :" +customername+ "\n"+ "Customer Address :"+custId +"\n"+
				           "Customer Date of Birth :" +cust_dob+ "\n"+ "Customer Account Opening Date:" + cust_account_opening_date +"\n"
				           +"Branch Details: "+branch_obj); 
	 }
}
