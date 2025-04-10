package Set;

public class objcls extends Object{

	//NOTES
	//The exclusive parent of every class is Object class as every class extends object class defaultly
	//There are some methods in Object class in which every classes uses this methods they are:
	//equals,hashcode,tostring,notify,notifyall,wait etc
	//there are some cases in which equals,hashcode,tostring etc other methods are overrided from objectclass and used in some other purposes
	public static void main(String[] args) {
		objcls o=new objcls();
		
		//Lets see the Object class methods one by one
		
		// 1> getclass method
		System.out.println(o.getClass());
		Class c=o.getClass();
		System.out.println(c);
		//returns the class of a specified object
		
		//2> Hashcode
		System.out.println(o.hashCode());
		Integer i=o.hashCode();
		System.out.println(i);
		//Hash code is the Integer address of the Object as it returns Integer value{Wrapper class}
		//Converts the address of object to Hexadecimal format
		
		//3> To-String
		System.out.println(o);
		System.out.println(o.toString());
		//The both above statements returns the address of the object as it is a combination of getclass+hashcode
		//if we want we can override this method 
		//this method is overided in various uses such as Pojo classes where we can print an object to its specified Fields
		
		//4>Difference between object.equals and operator ==
		objcls o1=new objcls();

		//now lets see the difference between equals and == methods
		//== is a comparison operator
		System.out.println(o==o1);
		//as it return true or false in the above case it returns false because it always looks for the addresses of objects
		//objects that are stored and compares with the address of other object in above case different  object has different memory address in heap so returns false
		
		
		//.equals method comes from object class methods 
		System.out.println(o.equals(o1));
		//this method also return boolean values and whether the different object adresses are same or not if not returns false or else true
		//as the operator == and .equals method perform same task if .equals method is coming from object class
		//there are some other classes which overrides these .equals methods from object class and provided its own implementation
		//Lets see examples
		
		String s=new String("sai");
		String s1=new String("sai");
		//lets check with == operator 
		System.out.println(s==s1);
		//return false as this operator always looks for adresses comparison between both objects
		
		
		//Lets check with .equals method
		System.out.println(s.equals(s1));
		//returns True the mechanism is if we mouse over to .equals it will redirect to String class rather than object class
		//which means .equals method is overrided in String class and provided its own implementation
		//In String class .equals method it compares whether the hashcode between this Strings are correct or not if we compare same type of Strings it will automatically contains same ascii value hash code
		//This is why it returns true becauses this method checks whether the content is same or not
		
	}

}
