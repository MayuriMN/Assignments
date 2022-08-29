package Assignment9OOPsFinalizeMeth;

import java.security.PublicKey;
import java.util.concurrent.CountDownLatch;
/**
 * 
 * @author mayuri.narwade
 *
 */
/*
 * With the help of finalize method print the how many objects are currently a
 * class is having and which object is going to be freed from the memory with
 * its hashcode.
 */
public class ClassFinalZ {
	
	private volatile static int counter;

	

	@Override
	protected void finalize() throws Throwable {
		counter++;
		System.out.println("No of Objects" +counter);
		super.finalize();
	}
	
	public static void main(String[] args) throws Throwable {
		
		ClassFinalZ cf1= new ClassFinalZ();
		ClassFinalZ cf2= new ClassFinalZ();
		ClassFinalZ cf3= new ClassFinalZ();
		ClassFinalZ cf4 = new ClassFinalZ();
		ClassFinalZ cf5 = new ClassFinalZ();
		ClassFinalZ cf6 = new ClassFinalZ();
		
		cf3 = null;
		cf5 = null;
		System.gc();
		
		for(int i=0;i<=6;i++)
		{
			String e = "cf "+i;
			System.out.println(e+e.hashCode());
		}
		

		System.out.println("cf3 :" +cf3);
		System.out.println("cf5 :" +cf5);
		
	}

}
