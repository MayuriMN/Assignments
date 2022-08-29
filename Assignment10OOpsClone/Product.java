package Assignment10OOpsClone;
/**
 * 
 * @author mayuri.narwade
 *
 */

/*
 * WAP to demonstrate the use of clone method. Clone one object of Product class
 * :- pid, pname, price and unitOfMeasurement. When you clone object of class
 * Product change the product name and price. With the help of instanceOf check
 * that the newly created object is belong to Product class or not.
 */
public class Product implements Cloneable {
	
	  public int pid;
	  public String pname;
	  public int price;
	  public String unitOfMeasurement;
	  
	  
	  
	  public Product(int pid, String pname, int price, String unitOfMeasurement) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}

	  public Object clone() throws CloneNotSupportedException
	  {
		  return super.clone();
	  }
	  
	  
	  
	/*
	 * public void ProductMethod(int pid,String pname,int price,String
	 * unitOfMeasurement) { System.out.println("PID :" +pid + "\n" +"PName :" +pname
	 * + "\n" +"Price :" +price + "\n" +"UnitOfMeasurement :" +unitOfMeasurement +
	 * "\n"); }
	 */
	
	  @Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", unitOfMeasurement="
				+ unitOfMeasurement + "]";
	}

	public static void main(String[] args) {
		  
		 // Product pd = new Product();
		  //pd.ProductMethod(789, "SamsungTV", 60000, "inches");
		 //d pd.clone(pt);
		
		  try
		  {
			  Product pd1 = new Product(789, "SamsungTV", 60000, "inches");
		
			  Product pd2 = (Product)pd1.clone();
			  
			  System.out.println("\n"+pd1.toString()+"\n");
			  System.out.println(pd2.toString()+"\n");
			  
			  //This method becomes true becouse pd2 is instance of Product else false
               System.out.println(pd2 instanceof Product);
			  
		  }
		  catch(CloneNotSupportedException c) {}
		  
	}

}
