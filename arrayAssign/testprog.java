package arrayAssign;

public class testprog {


	int rollno; 
	String name; 
	float fees; 
     testprog(int rollno,String name,float fees){ 
	rollno=rollno; 
	name=name; 
	fees=fees; 
	} 
	void setvalue(int rollno,String name,float fees){ 
	this.rollno=rollno; 
	this.name=name; 
	this.fees=fees; 
	 }
	 
	  
	void display()
	{
	System.out.println(rollno+" "+name+" "+fees);
	}  
	// end of class Student  
	  
	
	public static void main(String args[]){  
	  
	testprog s1=new testprog(111,"ankit",5000f);  
	  
	testprog s2=new testprog(112,"sumit",6000f);  
	  
	s2.setvalue(112,"sumit",6000f);
	  
	s1.display();  
	  
	s2.display();  
	  
	}
}