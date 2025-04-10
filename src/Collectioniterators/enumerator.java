package Collectioniterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class enumerator {
//enumerator is a kind of iterator used exclusively for legacy classes like vector and stack 
	//we are not able to use for other classes other than legacy classs
	//legacy classes are the classes which are introduced in V1.0
	//there are two methods in enumertor to iterate these classes
	//they are hasmoreelemnts() and nextelements()
	//hasmoreelemnts return boolean or checks whether futher element is present or not
	//nextelement pics the element
	//it fetches only in forward direction
	public static void main(String[] args) {
	 
		Vector<Integer> v=new Vector<>();
		v.add(21);
		v.add(22);
		v.add(45);
		v.add(20);
		
	Enumeration<Integer> h=	v.elements();
	while(h.hasMoreElements())
	{
		System.out.println(h.nextElement());
	}	
	}
}
