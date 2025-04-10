package Set;
import java.util.TreeSet;
public abstract class Treeset {
	//tree set is subclass of navigable set extends set navigable set also provide some methods to implements eg:ceiling,floor,higher,lower
	//tree set does not allow duplicate values
	//null insertion is not possible 
	//Storing order is preserved
	//if we print we get the values values according to ascending order
	//same kind of data will be allowed
	//it runs based on binary search tree algorithm or redblack tree
	public static void main(String[] args) {
//		TreeSet t=new TreeSet<>();
//		Integer i=new Integer(26);
//		Integer i1=new Integer(25);
//		System.out.println(i.compareTo(i1));
//		t.add(35);
//		t.add(21);
//		t.add(22);
//		t.add(i);
//		t.add(23);
//		t.add(24);
//		t.add(21);
//		System.out.println(t);
	//System.out.println("------------------------------------------------------------------------------------------------------------------------");	
		//MECHANISM OF TREESET
		//1>add methods internally meant for compareTo method of that specified datatype lika all wrapperclasses except pojo classes
		//because pojo is a userdefined class which does not contains compareto method like predifined classes
		//by this reason only it compares two values every time if we want to add element 
		//it uses binery search tree algorithm to sort in ascending order or to compare two elemnts
//System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");		
		//Binery search tree 
		//after we add first element in binery search tree this element is considered as root element 
		//based on this element only the tree has been framed and it blindly fixes the first datatype 
		//and does not allow other data to enter into it because it internally uses compareto technique 
		//so we cannot compare two different datatypes so thats the reason
		//we are trying to add second element the elemnent compares with the first elemnent and moves forward
		//1---->if first element is smaller than second element than element moves to left side of root node as a child node of root node
		//2---->if first element is larger than second element than element moves to right side of root node as a child node of root node
		//3---->if first element is equal to second element than doesnot stores into tree
		//a---->in case1 : it return s -1 if we compare two elements which means it should move to left side
		//b---->in case2 : it return s 1 if we compare two elements which means it should move to right side
		//a---->in case3 : it return s 0 if we compare two elemnts which means it should not enter into tree
		//by this way they are stored in ascending order
//System.out.println("-------------------------------------------------------------------------------------------------------------------------------");		
		//IN CASE OF STRINGS
//		TreeSet t1=new TreeSet<>();
//		t1.add("saikrishna");
//		t1.add("prathap");
//		t1.add("abhi");
//		System.out.println(t1);
//System.out.println("--------------------------------------------------------------------------------------------------------------------------");		
		//MECHANISM BEHIND STRINGS
		//if we are trying to add first string value in tree it confirm is as a string tree so no other datatypes are allowed
		//add method behind uses String class compare method to add String according to alphabets in ascending order they are compared
		//1---->if second element comes first according to alphabet comparison then it moves to left hand size 
		//2---->if second element comes after according to alphabet comparison then it moves to right hand size
		//3----->//if second element is same as first element then it recognizes and doesnt allow it to enter into tree
		//a---->in case1 : it return s -1 if we compare two elements which means it should move to left side
		//b---->in case2 : it return s 1 if we compare two elements which means it should move to right side
		//a---->in case3 : it return s 0 if we compare two elemnts which means it should not enter into tree
//System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//MECHANISM BEHIND POJO CLASSES USING COMPARABLE INTERFACE
//		TreeSet em=new TreeSet<>();
//		em.add(new employee(3,"Abhi", 10000));
//		em.add(new employee(2,"prathap", 30000));
//		em.add(new employee(1,"saikrishna", 20000));
//		em.add(new employee(1,"saikrishna", 20000));
//		System.out.println(em);
		//if we want to add employee objects in an treeset it looks for the compareto method in pojo class 
		//one method is to implement pojo class with comparable interface and overriding compareTo method
		//and provide our own implementation and get the data in ascending order based on requirements eg;by eid,ename,esal 
		//by overiding compareto method internally if we add employee object in treeset it redirects to employeepojo class
		//and we can get the data based on our requirements
		//but the disadvantage of using this technique is that we can only use one type for eg:based on eid,or based on ename,or based on esal
//System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");	
		//MECHANISM BEHIND POJO CLASSES USING COMPARATOR INTERFACE
		TreeSet em=new TreeSet<>(new employeeeid());
		//TreeSet em=new TreeSet<>(new employEname());
		//TreeSet em=new TreeSet<>(new employEsal());
		em.add(new employee(3,"Abhi", 10000));
		em.add(new employee(2,"prathap", 30000));
		em.add(new employee(1,"saikrishna", 20000));
		em.add(new employee(1,"saikrishna", 20000));
		System.out.println(em);
		//in this technique the above disadvantage will be rectified by providing separate classes for our comparision
		//in this mechanism by implementing comparator interface a separate class willbe given for our requirements eg:by employeeeid,by employEname,employEsal
		//we can pass any of these classes in our treeset as a treeset construct object and use according to our own requirement
		//in this technique we implements comparator interface and overide COMPARE method if we rediect this it will go to that overided class
		
	}

}
