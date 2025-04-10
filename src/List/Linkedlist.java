package List;

import java.util.ArrayList;
//linkedlist implements list,deque,cloneble,serializable
//list extends collections so all the collection methods and list methods implemented its abstract methods in subclasses like arraylist,linkedlist,queque
//According to their usage and functionality all arraylist,linkedlist,queque override methods of its parent class and provided their own implementation
//in Linkedlist there are three types 1>singlelinkedlist 2>doublelinkedlist 3>circularlinked list
//In singly linked list if we add element in list then a node will be created with three slots in single one first slot has been empty and middle one is filled with value that has been added and third one is filled with nextnode address so that it forms a link
//In doubly linked list if we add element in list then a node will be created with three slots in single one first slot has been filled with present address and middle one is filled with value that has been added and third one is filled with nextnode address so that it forms a link
//in circular list the last node of last slot contains the address of first element
//removing and adding elements in arraylist is the good practice as its not need rearranges its all indexes or elements if one element is added or removed because if we add or remove elements in elements it effects will be there only for two nodes as there a need to change the addresses of both no list will be effected
//fetching  data in linkedlist is a worst practice as it doesnot implements randomaccess
//storing of elements in AR is as like it has been added/serial
//any kind of data has been stored in arraylist
//duplicate elements has been accepted
//As Linked list implements deque it provides additional methods like addfirst and addlast
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<>();
		l1.add("saikrishna");
		l1.add("Srikanth");
		l1.add("Ravichandhu");
		l1.add("Prathap");
		System.out.println("Arraylist :"+l1);
		System.out.println("contains: "+l1.contains("Prathap"));
		System.out.println("index value :"+l1.get(0));
		System.out.println("getting index :"+l1.indexOf("Ravichandhu"));
		System.out.println("remove :"+l1.remove(0));
		l1.addFirst("krishna");
		l1.addLast("velthapu");
		System.out.println(l1);
	}
}


