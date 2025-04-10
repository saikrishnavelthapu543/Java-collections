package List;

import java.util.ArrayList;
import java.util.List;
//Arraylist implements list,random access,cloneble,serializable
//list extends collections so all the collection methods and list methods implemented its abstract methods in subclasses like arraylist,linkedlist,queque
//According to their usage and functionality all array list,linked list,queque override methods of its parent class and provided their own implementation
//as array list implements random access fetching
//removing and adding elements in array list is the worst practice as its rearranges its all indexes or elements if one element is added or removed
//storing of elements in AR is as like it has been added/serial
//any kind of data has been stored in array list
//duplicate elements has been accepted
//initial capacity of arraylist is 10 and it increases to 50% as it consumes initially allocated space
//NON safety for threads
//It uses dynamic array structure
//System.out.println("-------------------------------------------------------------------------------------------------------------");
public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList();
		l1.add("saikrishna");
		l1.add("Srikanth");
		l1.add("Ravichandhu");
		l1.add("Prathap");
		System.out.println("Arraylist :"+l1);
		System.out.println("contains: "+l1.contains("Prathap"));
		System.out.println("index value :"+l1.get(0));
		System.out.println("getting index :"+l1.indexOf("Ravichandhu"));
		System.out.println("remove :"+l1.remove(0));
//System.out.println("-------------------------------------------------------------------------------------------------------------");
	}

}
