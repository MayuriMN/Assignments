package OopsAssignmentQ3;

public class CustomerAccountStatement extends Customer {

	  private int caid;
	  private int custid;
	  private int amount;
	  private int depositwithdrawl;
	  private String deposite_date;
	public int getCaid() {
		return caid;
	}
	public void setCaid(int caid) {
		this.caid = caid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getDepositwithdrawl() {
		return depositwithdrawl;
	}
	public void setDepositwithdrawl(int depositwithdrawl) {
		this.depositwithdrawl = depositwithdrawl;
	}
	public String getDeposite_date() {
		return deposite_date;
	}
	public void setDeposite_date(String deposite_date) {
		this.deposite_date = deposite_date;
	}
	public CustomerAccountStatement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerAccountStatement(int caid, int custid, int amount, int depositwithdrawl, String deposite_date) {
		super();
		this.caid = caid;
		this.custid = custid;
		this.amount = amount;
		this.depositwithdrawl = depositwithdrawl;
		this.deposite_date = deposite_date;
	}
	
	@Override
	public String toString() {
		return "CustomerAccountStatement [caid=" + caid + ", custid=" + custid + ", amount=" + amount
				+ ", depositwithdrawl=" + depositwithdrawl + ", deposite_date=" + deposite_date + "]";
	}
	
	public void CustomerAccountStatmentMethod()
	{
	  System.out.println("Custmoer CAID :" +"\n"+ caid
			  +"Custmoer ID :" +"\n"+ custid
			  + "Custmoer Amount :" +"\n"+ amount
			  +"Custmoer Depositwithdrawl :" +"\n"+ depositwithdrawl
			  +"Custmoer Deposit Date :" +"\n"+ deposite_date);	
	}
	public void CustomerAccountStatementMethod(int caid, int custid, int amount, int depositwithdrawl, String deposite_date)  {
	
		System.out.println("Customer CAID :"+caid +"\n"+ "Customer ID :"+custid
				+"\n"+ "Customer Amount :"+amount+"\n"+ "Customer Deposite Withdrawl :"+depositwithdrawl
				+"\n"+ "Customer Deposit Date :" +deposite_date);
	}
	  
}
