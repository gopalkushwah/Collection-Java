package List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEx4 {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		v1.add(60);
		 
/*
 * **********************************
 * 	By using for loop
 * **********************************
*/
//			System.out.println("By using for Loop");
//			for(int i = 0;i<v1.size();i++) {
//				System.out.println(v1.get(i));
//			}
				
//******************************************************************************
		
/*
 * **********************************
 * 	By using for each Loop
 * **********************************
*/
//				System.out.println("By using forEach Loop");
//				for(Object val: v1) {
//					System.out.println(val);
//				}	
//******************************************************************************
		
/*
 * **********************************
 * 	By using forEach method
 * **********************************
*/
//			System.out.println("By using forEach method");
//			v1.forEach((n)->{
//				System.out.println(n);
//			});	
//******************************************************************************
		
/*
 * **********************************
 * 	By using iterator
 * **********************************
*/
//				System.out.println("By using Iterator");
//				Iterator i= v1.iterator();
//				while (i.hasNext()) {
//					Object object = (Object) i.next();
//					System.out.println(object);
//				}
//				
//				while (i.hasNext()) {
//					Object object = (Object) i.next();
//					i.remove();
//					System.out.println(object);
//				}
				
//				--> hasNext() : hasNext method check that, is there next element or not in an Vector
//							 it returns boolean value
//							 Returns true if the iteration has more elements.
				
				
//				--> next() : Returns the next element in the iteration.
//						  Returns true if the iteration has more elements.
				
//				--> remove() : Removes from the underlying collection the last element returned by this iterator (optional operation).
				
//******************************************************************************	

/*
 * **********************************
 * 	By using Enumeration
 * **********************************
 */
//			System.out.println("By using Enumeration");
//			Enumeration en = Collections.enumeration(v1);
//			while (en.hasMoreElements()) {
//				Object object = (Object) en.nextElement();
//				System.out.println(object);
//			}
//				
			
////			en.asIterator().forEachRemaining((n)->{
////				System.out.println(n);
//			});
////
////			In order to get enumeration over Vector with Java Collections, we use the java.util.Collections.enumeration() method.
////			hasMoreElements() : ---> An object that implements the Enumeration interface generates a series of elements, one at a time. hasMoreElements() method of Enumeration used to tests if this enumeration contains more elements. If enumeration contains more element then it will return true else false.
////			nextElement() : -------> An object that implements the Enumeration interface generates a series of elements, one at a time. The nextElement() method of Enumeration used to return the next element of this enumeration if this enumeration object has at least one more element to provide.This method is used to get elements from the enumeration.
								
//******************************************************************************
	
/*
 * **********************************
 * 	By using List Iterator
 * **********************************
 */

			System.out.println("By using List Iterator");
			ListIterator lsi = v1.listIterator();
			while (lsi.hasNext()) {
				Object object = (Object) lsi.next();
				System.out.println(object);
			}
			
			System.out.println("-----------------");
			while (lsi.hasPrevious()) {
				Object object = (Object) lsi.previous();
				System.out.println(object);
			}	
	}

}
