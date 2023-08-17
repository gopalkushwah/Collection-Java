package List;

import java.util.LinkedList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {

	public static void main(String[] args) {
		LinkedList lst = new LinkedList();
		
//-----------------------------------------------------------------------------
		
		
//-----------------------------------------------------------------------------
////	add method --- add new data
////	addFirst method --- add new data
////	addLast method --- add new data
		
//		lst.add(2);
//		lst.add(20);
//		lst.add(200);
//		lst.add(2000);
//		lst.add(2000);
//		lst.add(20000);
//		System.out.println(lst); //[2, 20, 200, 2000, 2000, 20000]
//	
//		lst.add(4,3000); //new data
//		System.out.println(lst);// [2, 20, 200, 2000, 3000, 2000, 20000]
//		
//		lst.addFirst(50);
//		System.out.println(lst);// [50, 2, 20, 200, 2000, 3000, 2000, 20000]
//		lst.addLast(50);
//		System.out.println(lst);// [50, 2, 20, 200, 2000, 3000, 2000, 20000, 50]
//-----------------------------------------------------------------------------
////set method --- add new data to given index value and replace that index value
//		lst.add(51);
//		lst.add(24);
//		lst.add(22);
//		lst.add(54);
//		lst.add(11);
//		
//		System.out.println(lst); //[51, 24, 22, 54, 11]
//		lst.set(2, 545);
//		System.out.println(lst);// [51, 24, 545, 54, 11]

//-----------------------------------------------------------------------------
//	isEmpty method --- returns boolean value
//		System.out.println(lst.isEmpty());//true
//		lst.add(51);
//		lst.add(24);
//		lst.add(22);
//		lst.add(54);
//		lst.add(11);
//		System.out.println(lst.isEmpty());// false

//-----------------------------------------------------------------------------
//	size method --- returns integer value//	System.out.println(lst.size());//true
//		lst.add(51);
//		lst.add(24);
//		lst.add(22);
//		lst.add(54);
//		lst.add(11);
//		System.out.println(lst.size());// 5

//-----------------------------------------------------------------------------
//	contains method --- returns boolean value
//		lst.add(51);
//		lst.add(24);
//		lst.add(22);
//		lst.add(54);
//		lst.add(11);
//		System.out.println(lst.contains(20));// false
//		System.out.println(lst.contains(54));// true

//-----------------------------------------------------------------------------
//	get(int index) method --- Returns the element at the specified position in this list.
//	getFirst() method --- Returns the first element in this list.
//	getLast() method --- Returns the last element in this list.

//		lst.add(51);
//		lst.add(24);
//		lst.add(22);
//		lst.add(54);
//		lst.add(11);
//		System.out.println(lst.get(3));// 54
//		System.out.println(lst.get(0));// 51
//		System.out.println(lst.getFirst());// 51
//		System.out.println(lst.getLast());// 11

//-----------------------------------------------------------------------------
//	addAll method --- Inserts all of the elements in the specified collection into this list, starting at the specified position.
//		LinkedList lst1 = new LinkedList();
//		lst.add(24);
//		lst.add(22);
//		lst.add(54);
//		lst.add(11);
//		
//		lst1.addAll(lst);
//		
//		lst1.add(21);
//		lst1.add(31);
//		lst1.add(41);
//		System.out.println(lst);// [24, 22, 54, 11]
//		System.out.println(lst1);// [24, 22, 54, 11, 21, 31, 41]

//-----------------------------------------------------------------------------
////	forEach method --- The forEach() method of lstayList used to perform the certain operation for each element in lstayList.
//		lst.add(51);
//		lst.add(24);
//		lst.add(22);
//		lst.add(54);
//		lst.add(11);
//		lst.forEach((n)->{ 
//			System.out.println(n);
//		});

//-----------------------------------------------------------------------------

////	clear() --->  Removes all of the elements from this list.
//		lst.add(51);
//		lst.add(24);
//		lst.add(22);
//		lst.add(54);
//		lst.add(11);
//		lst.clear();
//		System.out.println(lst); //[]
//		
//		lst.add(61);
//		lst.add(84);
//		lst.add(662);
//		lst.add(58);
//		lst.add(154);
//		System.out.println(lst); //[61, 84, 662, 58, 154]

//-----------------------------------------------------------------------------

////remove(int index) --->  Removes the element at the specified position in this list.
//		lst.add(51);
//		lst.add(24);
//		lst.add(22);
//		lst.add(54);
//		lst.add(11);
//		System.out.println(lst); //[51, 24, 22, 54, 11]
//		lst.remove(2);
//		System.out.println(lst); //[51, 24, 54, 11]

//-----------------------------------------------------------------------------

////remove(Object o) --->  Removes the first occurrence of the specified element from this list, if it is present.
//	removes all duplicate and copies it once only

//		LinkedList lst1 = new LinkedList();
//		lst.add(22);
//		lst.add(54);
//		lst.add(54);
//		lst.add(11);
//	
//		lst1.add(22);
//		lst1.add(54);
//		lst1.add(124);
//		lst1.add(525);
	
//		System.out.println(lst); //[22, 54, 54, 11]
//		lst1.remove(lst);
//		System.out.println(lst1); //[22, 54, 124, 525]

//-----------------------------------------------------------------------------

////removeAll(Collection<?> c) --->  Removes from this list all of its elements that are contained in the specified collection.
//	removes all duplicate 

//		LinkedList lst1 = new LinkedList();
//		lst.add(22);
//		lst.add(54);
//		lst.add(54);
//		lst.add(11);
//		
//		lst1.add(22);
//		lst1.add(54);
//		lst1.add(124);
//		lst1.add(525);
//	
//		System.out.println(lst); //[22, 54, 54, 11]
//		Boolean b = lst1.removeAll(lst);
//		System.out.println(lst1); //[22, 54, 124, 525]
//		System.out.println(b); //true
//-----------------------------------------------------------------------------
////sort(Comparator<? super E> c) --->  Sorts this list according to the order induced by the specified Comparator.
//		lst.add(22);
//		lst.add(54);
//		lst.add(54);
//		lst.add(11);
//		Collections.sort(lst);
//		System.out.println(lst); //[11, 22, 54, 54]
	
//-----------------------------------------------------------------------------
////subList(int fromIndex, int toIndex) --->  Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
//		lst.add(22);
//		lst.add(54);
//		lst.add(11);
//		lst.add(54);
//		lst.add(11);
//		lst.add(11);
//		List lst1 = lst.subList(0, 3);
//		
//		System.out.println(lst1); //[22, 54, 11]
	
//-----------------------------------------------------------------------------
////toArray() --->  Returns an Array containing all of the elements in this list in proper sequence (from first to last element).
//		lst.add(22);
//		lst.add(54);
//		lst.add(11);
//		lst.add(54);
//		lst.add(11);
//		lst.add(11);
//		
//		Object lst1[] = lst.toArray();
//		for(int i = 0;i<lst1.length;i++) {
//			System.out.println(lst1[i]); 
//		}
	
//-----------------------------------------------------------------------------
////indexOf() --->  returns an integer index of the given object or element ,
//					gives the index of first occurrence element
//		lst.add(22);
//		lst.add(54);
//		lst.add(11);
//		lst.add(54);
//		lst.add(11);
//		lst.add(11);
//		System.out.println(lst.indexOf(22));  //0
//		System.out.println(lst.indexOf(11));  //0
		
//-----------------------------------------------------------------------------
	////clone() --->  Returns Object type and return the same as previous List or LinkedList
//			Object lst1 = new Object();
//			lst.add(22);
//			lst.add(54);
//			lst.add(11);
//			lst.add(54);
//			lst.add(11);
//			lst.add(11);
//			lst1 = lst.clone();
//			System.out.println(lst);  //0
//			System.out.println(lst1);  //0
			
//-----------------------------------------------------------------------------

		
////offer(E e) --->  Adds the specified element as the tail (last element) of this list.
////offerFirst(E e) --->  Inserts the specified element at the front of this list.
////offerLast(E e) --->  Inserts the specified element at the end of this list.
//			lst.add(22);
//			lst.add(54);
//			lst.add(11);
//			lst.add(54);
//			lst.add(11);
//			lst.add(11);
//			
//			lst.offer(10);
//			System.out.println(lst);  //[22, 54, 11, 54, 11, 11, 10]
//			lst.offerFirst(20);
//			System.out.println(lst);  //[20, 22, 54, 11, 54, 11, 11, 10]
//			lst.offerLast(30);
//			System.out.println(lst);  //[20, 22, 54, 11, 54, 11, 11, 10, 30]
			
//-----------------------------------------------------------------------------
		
		
////peek() --->  Retrieves, but does not remove, the head (first element) of this list.
////peekFirst() --->  Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
////peekLast() --->  Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
//			lst.add(22);
//			lst.add(54);
//			lst.add(11);
//			lst.add(54);
//			lst.add(11);
//			lst.add(11);
//			
//			System.out.println(lst.peek());  //22
//			System.out.println(lst.peekFirst());  //22
//			System.out.println(lst.peekLast());  //11
		
//-----------------------------------------------------------------------------
		
		
////poll() --->  Retrieves and removes the head (first element) of this list
////pollFirst() --->  Retrieves and removes the first element of this list, or returns null if this list is empty.
////pollLast() --->  Retrieves and removes the last element of this list, or returns null if this list is empty.
		
//			lst.add(22);
//			lst.add(54);
//			lst.add(11);
//			lst.add(54);
//			lst.add(11);
//			lst.add(11);
//			
//			System.out.println(lst.poll());  //22
//			System.out.println(lst.pollFirst());  //54
//			System.out.println(lst.pollLast());  //11
//			
//			System.out.println(lst); //[11, 54, 11]
		
//-----------------------------------------------------------------------------		
		
////pop() --->  Pops an element from the stack represented by this list.
		
//			lst.add(22);
//			lst.add(54);
//			lst.add(11);
//			lst.add(54);
//			lst.add(11);
//			lst.add(11);
////			
//			System.out.println(lst.pop());  //22
//			System.out.println(lst);  //[54, 11, 54, 11, 11]
			
//-----------------------------------------------------------------------------
		
////push(E e) --->  Pushes an element onto the stack represented by this list.
		
//			lst.add(22);
//			lst.add(54);
//			lst.add(11);
//			lst.add(54);
//			lst.add(11);
//			lst.add(11);
//			
//			System.out.println(lst);  //[22, 54, 11, 54, 11, 11]
//			lst.push(10);
//			System.out.println(lst);  //[10, 22, 54, 11, 54, 11, 11]
		
//-----------------------------------------------------------------------------
		
////remove() --->  Retrieves and removes the head (first element) of this list.
////E remove(int index) --->  Removes the element at the specified position in this list.
////boolean	remove(Object o) --->  Removes the first occurrence of the specified element from this list, if it is present.
////E	removeFirst() --->  Removes and returns the first element from this list.
////boolean	removeFirstOccurrence(Object o) --->  Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
////E	removeLast() --->  Removes and returns the last element from this list.
////boolean	removeLastOccurrence(Object o) --->  Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).		
			
//			lst.add(22);
//			lst.add(54);
//			lst.add(11);
//			lst.add(54);
//			lst.add(100);
//			lst.add(144);
//			lst.add(154);
//			lst.add(178);
//			lst.add(10);
//			lst.add(387);
//			lst.add(23);
//			
			
////////			System.out.println(lst.remove());  //22 removed
//////			System.out.println(lst.remove(3));  //remove from index 3 ===> 54
////			System.out.println(lst.removeFirst());  //remove from first index ===> 22
//			System.out.println(lst.removeLast());  //remove from last index ===> 23
//-----------------------------------------------------------------------------

	}

}
