 package Map;


import java.util.Enumeration;
import java.util.Map.Entry;
import java.util.Set;


public class Hashtable {
public static void main(String[] args) {
//hashtable is also working based on hashing technique
//but the major difference between hashmap and hashtable is that it is a legacy class synchronization
//it does not allow any null values or key to enter
	java.util.Hashtable<String, String> h=new java.util.Hashtable();
	h.put("employeename", "saikrishna");
	h.put("employeeage", "21");
	h.put("employesalary", "21000");
	h.put("employeedepartment", "devoloper");
	System.out.println("---------------------------------------------------------------------------");

	Set<Entry<String, String>> k=h.entrySet();
	for(Entry<String, String> g:k)
	{
		System.out.println(g.getKey()+":"+g.getValue());
	}
	System.out.println("---------------------------------------------------------------------------");
	
Enumeration<String> f=	h.elements();
while(f.hasMoreElements())
{
	System.out.println(f.nextElement());
}

}
}
