package List;

public class Stack {
	//The methods which are used in vector can applicable to Stack also
	//Nevertheless,There are some methods which are used in stack like pop,push,peek,search
	//Stack follows the principle of LIFO(last in First out) it describes that the element which is added last will be removed first
	//A virtual imagination is needed in handling Stacks
	//As it extends vector class it is considered as thread safe 
	//Although due to some reasons it is considered as a legacy class
	//Initially the capacity of stack is 10 and doubles as increases 100%
	//That the Structure or order of elements in Stack has been Vertical rather than horizontal but if we print it the elements print horizontal
//System.out.println("-------------------------------------------------------------------------------------------------------------");
	public static void main(String[] args) {
		java.util.Stack s=new java.util.Stack();
		//push is used same like add 
		s.push("saikrishna");
		s.push(21);
		s.push("software engineer");
		System.out.println(s);
		System.out.println("Stack :"+s);
		System.out.println("contains: "+s.contains("Prathap"));
		System.out.println("index value :"+s.get(0));
		System.out.println("getting index :"+s.indexOf("saikrishna"));
		System.out.println("remove :"+s.remove(0));
		System.out.println(s);
		//search method counts from last element in increasing order and prints in which number the specified element is present Starting from last and counting from 1
		//peek method prints the last value that was present in the stack
		System.out.println(s.peek());
		//pop method automatically removes the last element that is added in Stack hence follows LIFO principle
		s.pop();
		System.out.println(s);
//System.out.println("-------------------------------------------------------------------------------------------------------------");
	}

}
