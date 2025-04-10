package Mapiterators;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import Collectioniterators.iterator;

import java.util.Map.Entry;

public class hashmapiterations {
//There are 5 major iterator operations that we need to perform in hashmap
//they are 1>entryset()withforloop 2>keyset()withforloop 3>valueswithforloop 4>entryset()withiterator  5>keyset()withiterator
	public static void main(String[] args) {
		HashMap<String, String> h=new HashMap<>();
		h.put("name", "saikrishna");
		h.put("age", "21");
		h.put("designation", "softwaredevoloper");
		h.put("salary", "20000");
		h.put("location", "hyderabad");
System.out.println("------------------------------------------------------------------------");
//returns a sequence of entries(keys,values)
		Set<Entry<String, String>> k=h.entrySet();
		for(Entry<String, String> g:k)
		{
			System.out.println(g.getKey()+":"+g.getValue());
		}
System.out.println("-------------------------------------------------------------------------------");
//returns sequence of keys if we want values we can call getmethod with reference(h.get())
		Set<String> j=h.keySet();
		for(String m:j)
		{
		System.out.println(m);	
		}
System.out.println("------------------------------------------------------------------------------------------");
//return only values of an entry because keys doesnot allow duplicate data whereas values can have duplicates so ambiguity problem
		Collection<String> n=h.values();
		for(String e:n)
		{
			System.out.println(e);
		}
System.out.println("----------------------------------------------------------------------------------------------");
	//returns sequence of entries as like entryset
		Iterator<Entry<String, String>> j1=h.entrySet().iterator();
		while(j1.hasNext())
		{
			System.out.println(j1.next());
		}
		
System.out.println("-----------------------------------------------------------------------------------------------------");
//returns sequence of keys if we want values we can call getmethod with reference(h.get())
	Iterator<String> r=	h.keySet().iterator();
	while(r.hasNext())
	{
		System.out.println(r.next());
	}
		
	}

}
