package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmap {
	//map is an interface like collections which  provides certain methods to be implemented in sub classes
	//Hashmap,linkedhashmap,hashtable,treemap these are the subclasses that provide implementation for map
	//these map implemented subclasses can store the data according to key values,an entry,pair
	//now let us see one by one 
	public static void main(String[] args) {
	//Hashmap is one the subclass that implements map
	//it stores the data in the format of keys and values
	//does not allow duplicate data
	//Storing data is not preserved
	//keys does not allow duplicate data while values could be duplcate ,can be null etc..
	//Hashing techniques has been appplied for only keys not values
	//in keys only once the null value can be stored
	//we can add userdefined objects as values and keys both can be supported
	//if a duplicate data is added in hashmap it does not allow key to enter but the value that is latest has been allocated as new value for that key
		
//System.out.println("--------------------------------------------------------------------------------");
		HashMap<String, String> h=new HashMap<>();
		h.put("employeename", "saikrishna");
		h.put("employeeage", "21");
		h.put("employesalary", "21000");
		h.put("employeedepartment", "devoloper");
		h.put(null, null);
		h.put(null, "sai");
		//duplicate data
		h.put("employesalary", "21000");
		//returns boolean on key whether the specified key is present or not
		System.out.println(h.containsKey("employeename"));
		//returns boolean on key whether the specified value is present or not
		System.out.println(h.containsValue("21"));
		//returns boolean on  whether the map is empty or not
		System.out.println(h.isEmpty());
		//returns value for key and removes 
		System.out.println(h.remove("employeeage"));
		//returns value for a specified key
		System.out.println(h.get("employesalary"));
		//returns set of keys that are present in hashmap
		Set<String> s=	h.keySet();
		System.out.println(s);
		//returns Collections of values that are present in hashmap
		Collection<String> c=h.values();
		System.out.println(c);
//System.out.println("--------------------------------------------------------------------------------");
		//HASHING MECHANISM ON KEYS OF INTEGER GENERICS
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
//System.out.println("--------------------------------------------------------------------------------");		
		//HASHING MECHANISM ON KEYS OF STRING GENERICS
		//in this scenario it adds String key which redirect to Hashcode method in String Wrapper class and generates hashcode according to its characters or ascii values
		//if we want to add duplicate data of same value it matches the previous hashcode of String value so rejects the allow of same value
//System.out.println("--------------------------------------------------------------------------------");		
		HashMap<employee, String> h1=new HashMap<>();
		h1.put(new employee(1, "saikrishna", 300000), "employee1");
		h1.put(new employee(2, "saikrishna", 300000), "employee2");
		h1.put(new employee(3, "saikrishna", 300000), "employee3");
		h1.put(new employee(4, "saikrishna", 300000), "employee4");
		System.out.println(h1);
//unlike other wrapper classes if we want to add user defined classes keys
//the hashcode methods redirects to object class hash code method and it will look address of objects 
//so if we add different objects with same content it will allow duplicate elements 
//to get rid of this problem we can override hascode() method and equals method in pojo classes
//in overided hascode and equals method contains the code which checks content not address 
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
