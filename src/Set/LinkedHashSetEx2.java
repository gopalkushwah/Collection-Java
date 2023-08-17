package Set;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx2 {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		
//		all the methods are same as the HashSet
		
		System.out.println(lhs.isEmpty()); //true
		lhs.add(12);
		lhs.add(22);
		lhs.add(32);
		lhs.add(42);
		System.out.println(lhs.isEmpty()); //false
		
		System.out.println(lhs); //[12, 22, 32, 42]
		System.out.println(lhs.size()); //4
		System.out.println(lhs.contains(22)); //true
		System.out.println(lhs.contains(20)); //false
		lhs.remove(12);
		System.out.println(lhs.hashCode()); //96 or any int value
		
//		Iterator it = lhs.iterator();
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			System.out.println(object);
//		}
		
		
		Enumeration em = Collections.enumeration(lhs);
//		while (em.hasMoreElements()) {
//			Object object = (Object) em.nextElement();
//			System.out.println(object);
//		}
		
//		em.asIterator().forEachRemaining(n->{
//			System.out.println(n);
//		});
	}

}
