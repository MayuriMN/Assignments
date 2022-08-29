package arrayAssign;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String args[])
	{
		List<Integer> list = Arrays.asList(111,222,111,333,111,666,666);
		
		Set<Integer> st = new HashSet<Integer>();
		
		list.stream().filter(x->!st.add(x)).collect(Collectors.toSet()).forEach(x-> System.out.println(x));
	}
	
}
