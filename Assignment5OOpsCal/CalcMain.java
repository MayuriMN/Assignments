
package Assignment5OOpsCal;
/**
 * 
 * @author mayuri.narwade
 *
 */
/*
 * Create class CalcAbs which is an abstract class it will have following
 * methods:- void sum(int a, int b); void sub(int a, int b), void mul(int a, int
 * b), void div(int a,int b). You have to perform multilevel inheritance where
 * at each level one method of CalcAbs will be overridden by the child class for
 * example:- Class CalcAbs Clsss A extends CalcAbs { it will override sum} Class
 * B extends A {it will override sub} Class C extends B {it will override mul}
 * Class D extends C {it will override div} At the fourth level you have to
 * create object and call all methods and print the results for all operations.
 */
public class CalcMain {
	
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		a.sum(12, 21);
		
		ClassB b = new ClassB();
		b.sub(32, 23);
		
		ClassC c = new ClassC();
		c.mul(24, 42);
		
		ClassD d = new ClassD();
		d.div(35, 3);
	}

}
