package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stackclass 
{
   public static void main(String [] args)
   {
	 
	   Stack<Object>stack=new Stack<>();
	   System.out.println(stack.capacity());
	   stack.push("a");
	   stack.push("b");
	   stack.push("c");
	   stack.push(null);
	   stack.push(null);
	   stack.push("f");
	   System.out.println(stack);
	   System.out.println(stack.get(0));
	   System.out.println(stack);
	   System.out.println(stack.pop());
	   System.out.println(stack.pop());
	   System.out.println(stack.peek());
	   System.out.println(stack);
	   stack.add(5);
	   stack.add(4);
	   stack.add(2);
	   System.out.println(stack);
	   stack.push("naga");
	   stack.push("uoo");
	   stack.add("naga");
	   stack.push("y");
	   System.out.println(stack);
	   System.out.println(stack.search("uoo"));
	   System.out.println(stack.lastIndexOf("uoo"));
	   stack .pop();
	   stack.remove("naga");
	   System.out.println(stack);
	   System.out.println(stack.size());
	   System.out.println(stack.contains("naga"));
	   System.out.println(stack.get(4));
	   
	  
   
   }
		   
}
