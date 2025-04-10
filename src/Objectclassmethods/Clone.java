package Objectclassmethods;

public class Clone {
//SHALLOW CLONING
//By default, the clone method in the Object class is protected. 
//This means you cannot directly call clone() on an object unless the object's class explicitly allows it.
//so we can provide implementation to clonable interface by implEments and we can override clone method explicitly
//refer Employee class
//by default object class clone() method provides shallow cloning which means
//If we try to alter the cloned object then it does not effect original product which is also known as perfect cloning
//if the object has fields that are references to other objects, the references are copied but not the objects themselves.
//By above statement we should provide deep cloning if the original object contains other object references
public static void main(String[] args) throws CloneNotSupportedException {
//	System.out.println("SHALLOW CLONING---------------------------------------------------------------------------------------");
//	Employee emp=new Employee(1, "saikrishna", "software engineeringg");
//	System.out.println("Original Object--->"+emp);
//	Employee emp1 = (Employee) emp.clone();
//	System.out.println("Cloned Object before modification---->"+emp1);
//	emp1.setEdesg("senior software engineer");
//	System.out.println("Original Object After Modification---->"+emp);
//	System.out.println("Cloned Object After Modification---->"+emp1);
System.out.println("------------------------------------------------------------------------------------------");
System.out.println("DEEP CLONING REQUIREMENT-------------------------------------------------------------------------------------------");
////DEEP CLONING
//Below scenario if we want to modify location than it will automatically affects the original object
//it leads to Unintended Side Effects so that we need DEEP cloning
	Employee emp3=new Employee(1, "saikrishna", "software engineeringg");
	location loc=new location("Borabanda", "secundrabad");
	emp3.setLoc(loc);
	System.out.println("Original Object---->"+emp3);
	Employee emp4=(Employee) emp3.clone();
	System.out.println("Cloned object before modification----->"+emp4);
	 emp4.getLoc().setDistrict("hyderabad");
      System.out.println("Cloned object after modification----->" + emp4);
      System.out.println("Original object after modification----->" + emp3);
  System.out.println("------------------------------------------------------------------------------------");
	
}
}

