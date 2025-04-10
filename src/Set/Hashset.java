package Set;

import java.util.HashSet;
import java.util.Set;
//there are certain limitations that has been occured with Arraylist some to overcome this drawback set has been introduced
//Some issues like duplicate data entry etc;
//set does not allow duplicate data it only ins unique data
//Hashset allows any kind of data
//There are three sub classes that implements set interface which further extends collections interface
//Hashset,linkedhashset,treeset
//System.out.println("-------------------------------------------------------------------------------------------------------------");
public class Hashset {
	//in hashset no duplicate data will be entered
	//allows null values
	//order of the elements is not preserverd or (unordered)
	//hashset extends Set<E>, Cloneable, java.io.Serializable
	//accessing elements in set is a good very fast compare to others
	//No retreival of data according to indexes as there is no specified order of retreival their is no indexes
//System.out.println("-------------------------------------------------------------------------------------------------------------");
	public static void main(String[] args) {
//		HashSet h=new HashSet();
//		h.add("saikrishna");
//		h.add(21);
//		h.add("softwareengineer");
//		h.add(20000.00);
//		System.out.println("Arraylist :"+h);
//System.out.println("-------------------------------------------------------------------------------------------------------------");
//		System.out.println("contains: "+h.contains("Prathap"));
//		System.out.println("size value :"+h.size());
//		System.out.println(h.isEmpty());
//		System.out.println("remove :"+h.remove(21));
//		System.out.println(h);
//System.out.println("-------------------------------------------------------------------------------------------------------------");		
		//MECHANISM BEHIND NO DUPLICATE DATA AND UNOREDRED RETRIEVAL
		//Behind the Scenes of add of different kind of data in Hashmap
		//Please go through objcls class to get more knowledge regarding this topic
//System.out.println("-------------------------------------------------------------------------------------------------------------");
		//Hashing Mechanism
		//HashSet h=new HashSet();
		//h.add(21); //behind the scenes
		//if we created an object of Hashset and we are trying to add int data
		//the mechansim if happen is if we add integer values it takes Wrapper class Integer
		Integer i=new Integer(21);
		//For this the hashcode does not generate from Object class method Integer wrapper class overides the method of hashcode and provide its own implementation
		//it takes the given int value as hashcode it does not generate any specific hashcode
		//it we want to try to add duplicate data it does not ready to enter in it
		//because it checks the previous value of hashcode due to it takes the given int value as hashcode it does not generate any specific hashcode
		//so both becomes same hashcode and conflict occur does not allow to enter into its specified bucket
	     //* @return  a hash code value for this object, equal to the
	    	//primitive {@code int} value represented by this
	    //{@code Integer} object.
		//this mechanism is same in all datatypes if we want to add same value it internally calls Wrapper classes
	//if we want to add int---->Integer wrapper class
		//if we want to add double---->Double wrapper class
		//if we want to add byte---->Byte wrapper class
		//if we want to add long---->Long wrapper class
		//if we want to add char---->Character wrapper class
//System.out.println("-------------------------------------------------------------------------------------------------------------");			
		//STRING BEHAVIOUR
		//h.add("saikrishna");
		//in this scenario it adds String value which redirect to Hashcode method in String Wrapper class and generates hashcode according to its characters or ascii values
		String s=new String("saikrishna");
		//if we want to add duplicate data of same value it matches the previous hashcode of String value so rejects the allow of same value
//System.out.println("-------------------------------------------------------------------------------------------------------------");
		//MECHANISM OF UNORDERD RETREIVAL
		//HashSet uses a hash table as its underlying data structure. 
		//The elements in a hash table are stored based on their hash codes, 
		//which determine the position of the elements in the table.
		//Because these hash codes are not sequential, 
		//the order of elements in the hash table does not reflect the order in which they were inserted.
//System.out.println("-------------------------------------------------------------------------------------------------------------");
		//Mechanism happens when we are trying to add userdefined objects
		employee e=new employee(1, "saikrishna", 20000);
		employee e1=new employee(2, "ravichandhu", 30000);
		employee e2=new employee(3, "ravichandhu", 30000);
		employee e3=new employee(3, "ravichandhu", 30000);
		HashSet h=new HashSet();
		h.add(e);
		h.add(e1);
		h.add(e2);
		h.add(e3);
		System.out.println(h);
		//unlike other wrapper classes if we want to add user defined classes objects
		//the hashcode methods redirects to object class hash code method and it will look address of objects 
		//so if we add different objects with same content it will allow duplicate elements 
		//to get rid of this problem we can override hascode() method and equals method in pojo classes
		//in overrided hashcode and equals method contains the code which checks content not address 
		//so if we override this method in our pojo classes it doesnot allow duplicate values inside it
		//and generates the hash code according to the content not the address
//System.out.println("-------------------------------------------------------------------------------------------------------------");
		//IMPORTANT NOTE
		//CASE 1--->the hashcode which is generated according to different content in both objects sometimes generates same hashcode //according to asccii values
		//CASE 2---->but the hashcode that is generated according to same content in both objects generates same hashcodes 
		//in case 1 there is a clash between hashcodes so hashset doesnt allow 
//System.out.println("-------------------------------------------------------------------------------------------------------------");
	}

}
