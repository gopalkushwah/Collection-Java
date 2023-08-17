package List;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
/*
 * *********************************
 * add(E e)
 * add(index,E e)
 * *********************************
*/

//				Vector<Integer> v1 = new Vector<Integer>();
//				v1.add(10);
//				v1.add(20);
//				v1.add(30);
//				v1.add(40);
//				v1.add(50);
//				v1.add(60);
//				 
//				v1.add(1,70); //add 70 at index 1 by shifting the whole vector v1 values by 1 index
//				System.out.println(v1); //[10, 70, 20, 30, 40, 50, 60]
//***************************************************************************
		
/*
 * *********************************
 * set(index,value) : it sets value at given index and replaces the value
 * *********************************
*/
//				Vector<Integer> v1 = new Vector<Integer>();
//				v1.add(10);
//				v1.add(20);
//				v1.add(30);
//				v1.add(40);
//				v1.add(50);
//				v1.add(60);
//				 
//				v1.set(1,70); //set 70 at index 1 by replacing the current value at index 1
//				System.out.println(v1); //[10, 70, 30, 40, 50, 60]
		
//***************************************************************************
		
/*
 * *********************************
 * size() : it returns an integer size of vector on the basis of the current count of values
 * *********************************
*/
		
//		Vector<Integer> v1 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		
//		System.out.println(v1.size()); //6
//***************************************************************************		
/*
 * *********************************
 * isEmpty() : it returns an boolean , on the basis of the size of the vector if size is zero then true otherwise false
 * *********************************
*/
//		Vector<Integer> v1 = new Vector<Integer>();
//		
//		System.out.println(v1.size()); //0
//		System.out.println(v1.isEmpty()); //true
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		
//		System.out.println(v1.isEmpty()); //6
//***************************************************************************

/*
 * *********************************
 * contains(Object o) : it returns an boolean , if given value present in the vector then returns true otherwise false
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		
//		System.out.println(v1.contains(10)); //true
		
//***************************************************************************

/*
 * *********************************
 * hasCode() : Returns the hash code value for this Vector.
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		Vector<Integer> v2 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		
//		v2.add(10);
//		v2.add(20);
//		v2.add(30);
//		v2.add(40);
//		v2.add(50);
//		v2.add(60);
//		v2.add(70);
//		
//		
//		System.out.println(v1.hashCode()); //true
//		System.out.println(v2.hashCode()); //true
//***************************************************************************
//		
///*
// * *********************************
// * equals(Object o) : Compares the specified Object with this Vector for equality.
// * 				if both objects contains same value then returns true otherwise false
// * *********************************
// */
//		Vector<Integer> v1 = new Vector<Integer>();
//		Vector<Integer> v2 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		
//		v2.add(10);
//		v2.add(20);
//		v2.add(30);
//		v2.add(40);
//		v2.add(50);
//		v2.add(60);
////		v2.add(70);
//		
//		System.out.println(v1.equals(v2)); //false
////***************************************************************************
		
/*
 * *********************************
 * clear() : Removes all of the elements from this Vector.
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		
//		v1.clear();
//		System.out.println(v1); //[]
////***************************************************************************
		
/*
 * *********************************
 * addElement(E obj) : Adds the specified component to the end of this vector, increasing its size by one..
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		v1.addElement(10);
//		v1.addElement(20);
//		v1.addElement(30);
//		v1.addElement(40);
//		v1.addElement(50);
//		v1.addElement(60);
//		
//		System.out.println(v1); //[10, 20, 30, 40, 50, 60]
////***************************************************************************
/*
 * *********************************
 * addAll(Object o) : Adds the specified component to the end of this vector, increasing its size by one.
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		Vector<Integer> v2 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		
//		v2.add(10);
//		v2.add(20);
//		v2.add(30);
//		v2.add(40);
//		v2.add(50);
//		v2.add(60);
//		v2.add(70);
////		v2.addAll(v1);// from the end index of vector
//		System.out.println(v2); //[10, 20, 30, 40, 50, 60, 70, 10, 20, 30, 40, 50, 60]
//		v2.addAll(3,v1);// from the given index of vector
//		
//		System.out.println(v2); //[10, 20, 30, 10, 20, 30, 40, 50, 60, 40, 50, 60, 70]
////***************************************************************************
/*
 * *********************************
 * copyInto(Object o) : Adds the specified component to the end of this vector, increasing its size by one.
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		
//		Integer []v2 = new Integer[v1.size()];
//		v2[0]=500;
//		v2[1]=600;
//		v2[2]=700;
//		v1.copyInto(v2); //copy v1 into v2 from the 0 index.
////						//all values will get replaced by the new values
//		for(Integer val : v2) {
//			System.out.println(val);
//		}
////***************************************************************************
/*
 * *********************************
 * firstElement() : Returns the first component (the item at index 0) of this vector.
 * lastElement() : Returns the last component of this vector.
 * lastIndexOf(Object o) : Returns the index of the last occurrence of the specified element in this vector, or -1 if this vector does not contain the element.
 * lastIndexOf(Object o, int index) : Returns the index of the last occurrence of the specified element in this vector, searching backwards from index, or returns -1 if the element is not found.
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		
//		System.out.println(v1.firstElement()); //10
//		System.out.println(v1.lastElement()); //60
//		System.out.println(v1.lastIndexOf(60)); //5
//		System.out.println(v1.lastIndexOf(60,2)); //-1, doesn't contains the 60 at index 2
////***************************************************************************
/*
 * *********************************
 * get(index) : Returns the element at the specified position in this Vector.
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		
//		System.out.println(v1.get(3)); //40
////***************************************************************************
/*
 * *********************************
 * iterator() : Returns an iterator over the elements in this list in proper sequence.
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		Iterator itr = v1.iterator();
//		while (itr.hasNext()) {
//			Object object = (Object) itr.next();
//			System.out.println(object);
//		}
		
////***************************************************************************

/*
 * *********************************
 * listIterator() : Returns a list iterator over the elements in this list (in proper sequence).
 * listIterator(int index) : Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		ListIterator ltr = v1.listIterator();
//		ListIterator ltr = v1.listIterator(3); //starting from the index 3
//		while (ltr.hasNext()) {
//			Object object = (Object) ltr.next();
//			System.out.println(object);
//		}

////***************************************************************************

/*
 * *********************************
 * remove(int index) : Removes the element at the specified position in this Vector.
 * remove(Object o) : Removes the first occurrence of the specified element in this Vector If the Vector does not contain the element, it is unchanged.
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
////		v1.remove(3);  // remove value 40 from index 3
////		System.out.println(v1); //[10, 20, 30, 50, 60]
//		
//		Integer in = 40;
//		v1.remove(in);  // remove the value 40
//		System.out.println(v1); //[10, 20, 30, 50, 60]
////***************************************************************************

/*
 * *********************************
 * 	removeAll(Collection<?> c) : Removes from this Vector all of its elements that are contained in the specified Collection.
 * 								removes all the same values from the vector
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		Vector<Integer> v2 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		
//		v2.add(40);
//		v2.add(50);
//		v2.add(60);
//		v1.removeAll(v2);
//		System.out.println(v1); //[10, 20, 30, 50, 60]
////***************************************************************************
//		
///*
// * *********************************
// * 	forEach(Consumer<? super E> action) : Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
// * *********************************
// */
//		Vector<Integer> v1 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		v1.forEach((n)->{
//			System.out.println(n);
//		});
////***************************************************************************
//		
/*
 * *********************************
 * 	replaceAll(UnaryOperator<E> operator) : Replaces each element of this list with the result of applying the operator to that element.
 * *********************************
 */
//		Vector<Integer> v1 = new Vector<Integer>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		v1.add(20);
//		
//		Collections.replaceAll(v1,20,5); //[10, 5, 30, 40, 50, 60, 5]
//		System.out.println(v1);
////***************************************************************************
	}

}
