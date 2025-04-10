package Map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import Set.employEsal;
import Set.employee;

public class Treemap {
	public static void main(String[] args) {
		
		//internally keys calls String class compare to method and prints the data in ascending order
		//same applicable for all wrapper classes
		TreeMap<String, String> t=new TreeMap<>();
		t.put("name", "saikrishna");
		t.put("age", "21");
		t.put("qualification", "btech");
		t.put("occupation", "jobseeker");
System.out.println("--------------------------------------------------------------------------------------------");		
		Set<Entry<String, String>> k=t.entrySet();
		for(Entry<String, String> p:k)
		{
			System.out.println(p);
		}
System.out.println("--------------------------------------------------------------------------------------------");	
//based on comparable interface
		TreeMap<employee, Integer> n=new TreeMap<>();
		n.put(new employee(4, "srikanth", 70000), 104);
		n.put(new employee(1, "saikrishna", 20000), 101);
		n.put(new employee(2, "Rakesh", 40000), 102);
		n.put(new employee(3, "chandhu", 40000), 103);
		Set<Entry<employee,Integer>> k1=n.entrySet();
		for(Entry<employee,Integer> p:k1)
		{
			System.out.println(p);
		}
System.out.println("--------------------------------------------------------------------------------------------");	
//based on comparator interface
TreeMap<employee, Integer> n1 = new TreeMap(new employEname());
		n1.put(new employee(4, "srikanth", 70000), 104);
		n1.put(new employee(1, "saikrishna", 20000), 101);
		n1.put(new employee(2, "Rakesh", 40000), 102);
		n1.put(new employee(3, "chandhu", 40000), 103);
		Set<Entry<employee,Integer>> k2=n1.entrySet();
		for(Entry<employee,Integer> p:k2)
		{
			System.out.println(p);
		}
	}
}
