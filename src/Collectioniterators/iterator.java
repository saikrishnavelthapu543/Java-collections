package Collectioniterators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import List.Arraylist1;
import Set.Hashset;
public class iterator {
	
public static void main(String[] args) {
	
	//there are two ways to iterate arraylist they are listiterator and iterator
	//listiterator can only used for list implemented classes
	//where as iterator method is used in any collection classes
	//mainly these iterators is used to fetch the data in a structured format
//System.out.println("---------------------------------------------------------------------------------------");
	List<Integer> l=new ArrayList();
	l.add(1);
	l.add(21);
	l.add(2000);
	Iterator i=l.iterator();
	//iterator has three methods 1>hasnext 2>next 3>remove
	//ata time we can use these methods to iterate 
	//hasnext method can return boolean true if forward element is present it always looks forward
	//next method redirects to next element directly
	//remove method can remove elemnts while iterating
	//this iterator can only looks in forward direction by hasnext() method
//System.out.println(-----------------------------------------------------------------------------------------------------);
	while(i.hasNext())
	{
		Integer k=(Integer) i.next();
		if(k==2000)
		{
			i.remove();
		}
	}
	System.out.println(l);
//System.out.println("-------------------------------------------------------------------------------------------------------------------");	
	HashSet<String> l1=new HashSet<>();
	l1.add("saikrishna");
	l1.add("ravi");
	l1.add("srikanth");
	Iterator<String> I= l1.iterator();
	while(I.hasNext())
	{
		String name=I.next();
	
		if(name.equals("srikanth"))
		{
			I.remove();
		}
	}
	System.out.println(l1);
	
	//For all the collection classes we can use iterator method to iterate irrespective of their interfaces
	
	
}
}
