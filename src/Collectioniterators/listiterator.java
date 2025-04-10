package Collectioniterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listiterator {
//listiterator is also another technique to iterate collection classes
	//but they are only applicable for list implemented classes like arraylist,linkedlist,vector,stack
	//there are extra methods that has been provided by the listiterator they are add(),remove,hasprevios(),hasnext(),next()etc;
	//list iterator is bi directional it will look forward direction if we call hasnext() method
	//if we call hasprevious() method in listiterator than it will run in backward direction 
	//lets see both the scenarios
 public static void main(String[] args) {
// System.out.println("-------------------------------------------------------------------------------------------------------------------");
	 List<Integer> l=new ArrayList();
		l.add(1);
		l.add(21);
		l.add(2000);
		
	ListIterator<Integer> k=	l.listIterator();
	System.out.println(l);
	while(k.hasNext())
	{
		Integer i=k.next();
		if(i==21)
		{
			k.add(2100);
		}
	}
	System.out.println(l);
System.out.println("----------------------------------------------------------------------------------------------------------------");	
	while(k.hasPrevious())
	{
		System.out.println(k.previous());
	}
	 
	 
	}
}
