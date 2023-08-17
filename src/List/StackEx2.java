package List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackEx2 {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>(); // will accept only integer values

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
//		
//		System.out.println(st);

//		****************************************************************
//		/*
//		 * ****************************
//		 * By using for loop 
//		 * ****************************
//		 *
//		*/
//		
//		for(int i = 0;i<st.size();i++) {
//			System.out.println(st.get(i));
//		}

//		****************************************************************
		/*
		 * **************************** 
		 * By using for each loop 
		 * ****************************
		 *
		 */

//		for (int val : st) {
//			System.out.println(val);
//		}
		
//		****************************************************************
		/*
		 * **************************** 
		 * By using for each loop 
		 * ****************************
		 *
		 */
		
//		st.forEach((val)->{
//			System.out.println(val);
//		});
		
		
		
//		****************************************************************
		/*
		 * **************************** 
		 * By using forEach method 
		 * ****************************
		 *
		 */
		
//		st.forEach((val)->{
//			System.out.println(val);
//		});
//		****************************************************************
		
		/*
		 * **************************** 
		 * By using Iterator method
		 * ****************************
		 *
		 */
//		Iterator it = st.iterator();
//		while(it.hasNext()) {
//			Object obj = (Object) it.next();
//			System.out.println(obj);
//		}
//		****************************************************************
		
		
		/*
		 * **************************** 
		 * By using List Iterator method
		 * ****************************
		 *
		 */
//		ListIterator it = st.listIterator();
//		while(it.hasNext()) {
//			Object obj = (Object) it.next();
//			System.out.println(obj);
//		}
//		****************************************************************
		
		/*
		 * **************************** 
		 * By using Enumeration
		 * ****************************
		 *
		 */
//		Enumeration en = st.elements();
//		while(en.hasMoreElements()) {
//			Object obj = (Object) en.nextElement();
//			System.out.println(obj);
//		}
		
//		Enumeration en = Collections.enumeration(st);
//		while(en.hasMoreElements()) {
//			Object obj = (Object) en.nextElement();
//			System.out.println(obj);
//		}
		
		
		Enumeration en = Collections.enumeration(st);
		en.asIterator().forEachRemaining((n)->{
			System.out.println(n);
		});
		
		
//		****************************************************************
	}

}
