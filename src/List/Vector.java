package List;

import java.util.LinkedList;
//Vector is similar to Arraylist
//all the methods and methods that are present in arraylist also purely applicable for vector
//the major difference is that Vector is a thread safer subclass as it uses synchronized keyword
//Initially the capacity of vector is 10 and doubles as increases 100% space
//it restricts the entry of the multiple threads act simultaneously
//System.out.println("-------------------------------------------------------------------------------------------------------------");
public class Vector {

	public static void main(String[] args) {
		java.util.Vector l1=new java.util.Vector();
		l1.add("saikrishna");
		l1.add("Srikanth");
		l1.add("Ravichandhu");
		l1.add("Prathap");
		System.out.println("Arraylist :"+l1);
		System.out.println("contains: "+l1.contains("Prathap"));
		System.out.println("index value :"+l1.get(0));
		System.out.println("getting index :"+l1.indexOf("Ravichandhu"));
		System.out.println("remove :"+l1.remove(0));
		System.out.println(l1);
//System.out.println("-------------------------------------------------------------------------------------------------------------");
	}

}
