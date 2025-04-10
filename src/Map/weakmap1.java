package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

import Collectioniterators.iterator;

public class weakmap1 {
	public static void main(String[] args) {
		employee e1=new employee(1, "saikrishna", 20000);
		employee e2=new employee(2, "ajay", 20000);
		employee e3=new employee(3, "mallesh", 20000);
		HashMap<employee, String> h=new HashMap<>();
		h.put(e1, "101");
		h.put(e2, "102");
		h.put(e3, "103");
		
		e1=e2;
		System.gc();
		
	Iterator<Entry<employee, String>> j=	h.entrySet().iterator();
	while(j.hasNext())
	{
		System.out.println(j.next());
	}
System.out.println("-------------------------------------------------------------------------");
		employee e4=new employee(1, "saikrishna", 20000);
		employee e5=new employee(2, "ajay", 20000);
		employee e6=new employee(3, "mallesh", 20000);
		WeakHashMap<employee, String> h1=new WeakHashMap();
		h1.put(e4, "101");
		h1.put(e5, "102");
		h1.put(e6, "103");
		
		e4=e5;
		System.gc();
		
		Iterator<Entry<employee, String>> j1=	h1.entrySet().iterator();
		while(j1.hasNext())
		{
		System.out.println(j1.next());
		}
//Weakhashp map does not iterate the object that prone to garbage collector whereas Hashmap does
	}
}
