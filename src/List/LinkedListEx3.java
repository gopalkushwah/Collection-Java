package List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx3 {

	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		lst.add(60);
		lst.add(70);
		

/*
 * **********************************
 * 	By using for loop
 * **********************************
*/
//		System.out.println("By using for Loop");
//		for(int i = 0;i<lst.size();i++) {
//			System.out.println(lst.get(i));
//		}
		
//******************************************************************************
		
/*
 * **********************************
 * 	By using for each Loop
 * **********************************
*/
//		System.out.println("By using forEach Loop");
//		for(Object val: lst) {
//			System.out.println(val);
//		}	
//******************************************************************************
		
/*
 * **********************************
 * 	By using forEach method
 * **********************************
*/
//		System.out.println("By using forEach method");
//		lst.forEach((n)->{
//			System.out.println(n);
//		});	
//		System.out.println("***********************************");
//		lst.forEach((n)->{
//			if(n>=50) {
//				System.out.println(n);
//			}
//		});	
//******************************************************************************
		
/*
 * **********************************
 * 	By using iterator
 * **********************************
*/
//		System.out.println("By using Iterator");
//		Iterator i=lst.iterator();
//		while (i.hasNext()) {
//			Object object = (Object) i.next();
//			System.out.println(object);
//		}
//		
//		while (i.hasNext()) {
//			Object object = (Object) i.next();
//			i.remove();
//			System.out.println(object);
//		}
		
//		Iterator itr = lst.descendingIterator();
//		while (itr.hasNext()) {
//			Object object = (Object) itr.next();
//			System.out.println(object);
//		}
		
//		--> hasNext() : hasNext method check that, is there next element or not in an LinkedList
//					 it returns boolean value
//					 Returns true if the iteration has more elements.
		
		
//		--> next() : Returns the next element in the iteration.
//				  Returns true if the iteration has more elements.
		
//		--> remove() : Removes from the underlying collection the last element returned by this iterator (optional operation).
		
//******************************************************************************	
		
/*
 * **********************************
 * 	By using Enumeration
 * **********************************
 */
//			System.out.println("By using Enumeration");
//			Enumeration en = Collections.enumeration(lst);
//			while (en.hasMoreElements()) {
//				Object object = (Object) en.nextElement();
//				System.out.println(object);
//			}
//					
//				en.asIterator().forEachRemaining((n)->{
//					System.out.println(n);
//				});

////				In order to get enumeration over LinkedList with Java Collections, we use the java.util.Collections.enumeration() method.
////				hasMoreElements() : ---> An object that implements the Enumeration interface generates a series of elements, one at a time. hasMoreElements() method of Enumeration used to tests if this enumeration contains more elements. If enumeration contains more element then it will return true else false.
////				nextElement() : -------> An object that implements the Enumeration interface generates a series of elements, one at a time. The nextElement() method of Enumeration used to return the next element of this enumeration if this enumeration object has at least one more element to provide.This method is used to get elements from the enumeration.
						
//******************************************************************************
		
/*
 * **********************************
 * 	By using List Iterator
 * **********************************
 */

//		System.out.println("By using List Iterator");
//		ListIterator lsi = lst.listIterator();
//		while (lsi.hasNext()) {
//			Object object = (Object) lsi.next();
//			System.out.println(object);
//		}
////		
//		System.out.println("-----------------");
//		while (lsi.hasPrevious()) {
//			Object object = (Object) lsi.previous();
//			System.out.println(object);
//		}
	}

}
