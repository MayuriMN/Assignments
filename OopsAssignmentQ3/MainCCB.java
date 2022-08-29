package OopsAssignmentQ3;

public class MainCCB {
	
	public static void main(String args[])
	{
	//	Customer cus = new Customer();
	//	Branch br = new Branch();
	//	CustomerAccountStatement cas = new CustomerAccountStatement(100,111,4000,24000, "24/6/2022");
		
	
		CustomerAccountStatement casAccountStatement = new CustomerAccountStatement();
		casAccountStatement.CustomerMethod(111100, 12340, "mayuri", "Ambegav Khurd", "18/6/1999", "18/9/1919", "Dhabkavadi branch");
		casAccountStatement.BranchMethod(112,"Dhankavdi branch","Dhankavdi Pune MH");
		casAccountStatement.CustomerAccountStatementMethod(999,111100,24000, 8000, "yes");
		
		
		
	}

}
