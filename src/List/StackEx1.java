package List;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		Stack st = new Stack();
		
//		st.push(10);
//		st.push("gopal");
//		st.push("Anish");
//		st.push(true);
//		st.push('c');
//		st.push(55.5f);
//		st.push(55.5d);
//		
//		System.out.println(st);  //[10, gopal, Anish, true, c, 55.5, 55.5]
		
//		**********************************************************************
//		capacity()  and  size()
		
//		st.push(100);
//		st.push(200);
//		st.push(300);
//		st.push(400);
//		st.push(500);
//		st.push(600);
//		System.out.println(st.capacity()); //initial capacity 10
//		System.out.println(st.size()); //6
//		st.push(100);
//		st.push(200);
//		st.push(300);
//		st.push(400);
//		st.push(500);
//		st.push(600);
//		System.out.println(st.capacity()); //20
//		System.out.println(st.size()); //12
//		**********************************************************************

//		peek()--> it will return the top most value of stack
		
//		st.push(100);
//		st.push(200);
//		st.push(300);
//		st.push(400);
//		st.push(500);
//		st.push(600);
//		System.out.println(st.peek()); //600
//		**********************************************************************
//		pop() ---> it removes the top most value from stack
		
//		st.push(100);
//		st.push(200);
//		st.push(300);
//		st.push(400);
//		st.push(500);
//		st.push(600);
//		System.out.println(st.pop()); //600
//		System.out.println(st); //after pop [100, 200, 300, 400, 500]
		
//		**********************************************************************
		
//		empty() ----> it returns the boolean value , if stack contains some value then returns false otherwise returns true
		
//		System.out.println(st.empty()); //true
//		st.push(100);
//		st.push(200);
//		st.push(300);
//		st.push(400);
//		st.push(500);
//		st.push(600);
//		System.out.println(st.empty()); //false
		
//		**********************************************************************
		
//		add() ---> it works same as push method in stack
//		st.add(100);
//		st.add(200);
//		st.add(300);
//		st.add(400);
//		st.add(500);
//		st.add(600);
//		st.add(700);
//		System.out.println(st);  //[100, 200, 300, 400, 500, 600, 700]
//		**********************************************************************
//		contains(Object o) ---> it returns true if given value present in the stack otherwise returns false
		
//		st.add(100);
//		st.add(200);
//		st.add(300);
//		st.add(400);
//		st.add(500);
//		st.add(600);
//		st.add(700);
//		System.out.println(st.contains(800));  //false
//		System.out.println(st.contains(700));  //true

//		**********************************************************************

//		search(Object o) 
//		st.push(100);
//		st.push(200);
//		st.push(300);
//		st.push(400);
//		st.push(500);
//		st.push(600);
		
//		System.out.println(st.search(500));
//		**********************************************************************
		
//		all method of vector will work same on stack 
//		so first learn vector before learning the stack
		
		
		
//		*********************************************************************
//		Stack can have multiple null values
		
		st.push(null);
		st.push(null);
		st.push(null);
		st.push(null);
		st.push(null);
		st.push(null);
		System.out.println(st);  //[null, null, null, null, null, null]
//		*********************************************************************
	}

}
