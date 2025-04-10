package Objectclassmethods;
import java.util.ArrayList;
import java.util.List;
public class Finalize {
//The primary purpose of the finalize method was to give the object a chance to clean up resources 
//(like closing files, releasing memory, etc.) before it gets garbage collected.
//when we call system.gc() then internally garbage collector calls finalize method
//There's no guarantee when, or even if, finalize will be called. Garbage collection is not deterministic, 
//so you can't rely on finalize to release resources promptly.
//It is a depreciated method not used now a days due to performance issue
	public static void m1()
	{
		Employee emp3=new Employee();
	}
//Scenarios where objects are eligible for garbage collector we can confirm through logs in Employee class finilize method
//1>when there is no reference new Employee();
//2>when an reference prone to null value like emp=null;
//3>when we are reassigning the objects emp2=emp1; in this case first object is eligible for garbage collector
//4>Objects inside the block is also eligible for garbage collector 
//eligible for garbage collection after this method finishes its execution
//5>Objects in a Collection (Like an ArrayList)
//in 5th case after removing all elements then the collection object is eligible for garbage collection until an element exists.
	public static void main(String[] args) {
		new Employee();
		Employee emp=new Employee();
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp2=emp1;
		emp=null;
		m1();
		List<Employee> list = new ArrayList<>();
		Employee obj = new Employee();
		list.add(obj);
		list.remove(obj); // The Employee object is eligible for garbage collection
		System.gc();
//check the console to know how many times finalize method has been called
	}
}
