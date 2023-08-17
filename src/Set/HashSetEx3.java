package Set;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx3 {

	public static void main(String[] args) {
//		Learn About the Iterators 
		
		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add(30);
		hs.add(20);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		
//		***********************************************************************
//		Iterator<E>	iterator() - Returns an iterator over the elements in this set.

//		Iterator it = hs.iterator();
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			System.out.println(object);
//		}

		Enumeration em = Collections.enumeration(hs);
//		while (em.hasMoreElements()) {
//			Object object = (Object) em.nextElement();
//			System.out.println(object);
//		}
		
		em.asIterator().forEachRemaining(n->{
			System.out.println(n);
		});
		
	}

}
