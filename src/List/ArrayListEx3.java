package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx3 {

	public static void main(String[] args) {
//-----------------------------------------------------------------------------
////		add method --- add new data
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(2);
//		arr.add(20);
//		arr.add(200);
//		arr.add(2000);
//		arr.add(2000);
//		arr.add(20000);
////		System.out.println(arr); //[2, 20, 200, 2000, 2000, 20000]
//		
//		arr.add(4,3000); //new data
//		System.out.println(arr);// [2, 20, 200, 2000, 3000, 2000, 20000]
//-----------------------------------------------------------------------------
////	set method --- add new data to given index value and replace that index value
//		ArrayList<Integer> arr1 = new ArrayList<Integer>();
//		arr1.add(51);
//		arr1.add(24);
//		arr1.add(22);
//		arr1.add(54);
//		arr1.add(11);
//		
//		arr1.set(2, 545);
////		System.out.println(arr1); //[51, 24, 22, 54, 11]
//		System.out.println(arr1);// [51, 24, 545, 54, 11]

//-----------------------------------------------------------------------------
//		isEmpty method --- returns boolean value
//		ArrayList<Integer> arr2 = new ArrayList<Integer>();
//		System.out.println(arr2.isEmpty());//true
//		arr2.add(51);
//		arr2.add(24);
//		arr2.add(22);
//		arr2.add(54);
//		arr2.add(11);
//		System.out.println(arr2.isEmpty());// false

//-----------------------------------------------------------------------------
//		size method --- returns integer value
//		ArrayList<Integer> arr3 = new ArrayList<Integer>();
//		System.out.println(arr3.size());//true
//		arr3.add(51);
//		arr3.add(24);
//		arr3.add(22);
//		arr3.add(54);
//		arr3.add(11);
//		System.out.println(arr3.size());// false

//-----------------------------------------------------------------------------
//		contains method --- returns boolean value
//		ArrayList<Integer> arr4 = new ArrayList<Integer>();
//		arr4.add(51);
//		arr4.add(24);
//		arr4.add(22);
//		arr4.add(54);
//		arr4.add(11);
//		System.out.println(arr4.contains(20));// false
//		System.out.println(arr4.contains(54));// true

//-----------------------------------------------------------------------------
//		get method --- Returns the element at the specified position in this list.
//		ArrayList<Integer> arr5 = new ArrayList<Integer>();
//		arr5.add(51);
//		arr5.add(24);
//		arr5.add(22);
//		arr5.add(54);
//		arr5.add(11);
//		System.out.println(arr5.get(3));// 54
//		System.out.println(arr5.get(0));// 51

//-----------------------------------------------------------------------------
//		addAll method --- Inserts all of the elements in the specified collection into this list, starting at the specified position.
//		ArrayList<Integer> arr5 = new ArrayList<Integer>();
//		ArrayList<Integer> arr6 = new ArrayList<Integer>();
//		arr5.add(24);
//		arr5.add(22);
//		arr5.add(54);
//		arr5.add(11);
//		
//		arr6.addAll(arr5);
//		
//		arr6.add(21);
//		arr6.add(31);
//		arr6.add(41);
//		System.out.println(arr6);// 54

//-----------------------------------------------------------------------------
////		forEach method --- The forEach() method of ArrayList used to perform the certain operation for each element in ArrayList.
//		ArrayList<Integer> arr7 = new ArrayList<Integer>();
//		arr7.add(51);
//		arr7.add(24);
//		arr7.add(22);
//		arr7.add(54);
//		arr7.add(11);
////		arr7.forEach((n)->{ 
////			System.out.println(n);
////		});
//		
//		
//		arr7.forEach((n)->{ 
//			if(n>50) {
//				System.out.println(n);
//			}
//		});

//-----------------------------------------------------------------------------

////		clear() --->  Removes all of the elements from this list.
//		ArrayList<Integer> arr8 = new ArrayList<Integer>();
//		arr8.add(51);
//		arr8.add(24);
//		arr8.add(22);
//		arr8.add(54);
//		arr8.add(11);
//		arr8.clear();
//		System.out.println(arr8); //[]
//		
//		arr8.add(61);
//		arr8.add(84);
//		arr8.add(662);
//		arr8.add(58);
//		arr8.add(154);
//		System.out.println(arr8); //[61, 84, 662, 58, 154]

//-----------------------------------------------------------------------------

////	remove(int index) --->  Removes the element at the specified position in this list.
//		ArrayList<Integer> arr11 = new ArrayList<Integer>();
//		arr11.add(51);
//		arr11.add(24);
//		arr11.add(22);
//		arr11.add(54);
//		arr11.add(11);
//		System.out.println(arr11); //[51, 24, 22, 54, 11]
//		arr11.remove(2);
//		System.out.println(arr11); //[51, 24, 54, 11]

//-----------------------------------------------------------------------------

////	remove(Object o) --->  Removes the first occurrence of the specified element from this list, if it is present.
//		removes all duplicate and copies it once only

//		ArrayList<Integer> arr12 = new ArrayList<Integer>();
//		ArrayList<Integer> arr13 = new ArrayList<Integer>();
//		arr12.add(22);
//		arr12.add(54);
//		arr12.add(54);
//		arr12.add(11);
//		
//		arr13.add(22);
//		arr13.add(54);
//		arr13.add(124);
//		arr13.add(525);
//		
//		System.out.println(arr12); //[22, 54, 54, 11]
//		arr13.remove(arr12);
//		System.out.println(arr13); //[22, 54, 124, 525]

//-----------------------------------------------------------------------------

////	removeAll(Collection<?> c) --->  Removes from this list all of its elements that are contained in the specified collection.
//		removes all duplicate 

//		ArrayList<Integer> arr12 = new ArrayList<Integer>();
//		ArrayList<Integer> arr13 = new ArrayList<Integer>();
//		arr12.add(22);
//		arr12.add(54);
//		arr12.add(54);
//		arr12.add(11);
//		
//		arr13.add(22);
//		arr13.add(54);
//		arr13.add(124);
//		arr13.add(525);
//		
//		System.out.println(arr12); //[22, 54, 54, 11]
//		Boolean b = arr13.removeAll(arr12);
//		System.out.println(arr13); //[22, 54, 124, 525]
//		System.out.println(b); //true
//-----------------------------------------------------------------------------
////	sort(Comparator<? super E> c) --->  Sorts this list according to the order induced by the specified Comparator.
//		ArrayList<Integer> arr12 = new ArrayList<Integer>();
//		arr12.add(22);
//		arr12.add(54);
//		arr12.add(54);
//		arr12.add(11);
//		Collections.sort(arr12);
//		System.out.println(arr12); //[11, 22, 54, 54]
		
//-----------------------------------------------------------------------------
////	subList(int fromIndex, int toIndex) --->  Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
//		ArrayList<Integer> arr12 = new ArrayList<Integer>();
//		arr12.add(22);
//		arr12.add(54);
//		arr12.add(11);
//		arr12.add(54);
//		arr12.add(11);
//		arr12.add(11);
//		List<Integer> arr13 = arr12.subList(0, 3);
//		
//		System.out.println(arr13); //[22, 54, 11]
		
//-----------------------------------------------------------------------------
////	toArray() --->  Returns an array containing all of the elements in this list in proper sequence (from first to last element).
//		ArrayList<Integer> arr12 = new ArrayList<Integer>();
//		arr12.add(22);
//		arr12.add(54);
//		arr12.add(11);
//		arr12.add(54);
//		arr12.add(11);
//		arr12.add(11);
//		
//		Object arr[] = arr12.toArray();
//		for(int i = 0;i<arr.length;i++) {
//			System.out.println(arr[i]); 
//		}
		
//-----------------------------------------------------------------------------
////	indexOf() --->  returns an integer index of the given object or element
		ArrayList<Integer> arr12 = new ArrayList<Integer>();
		arr12.add(22);
		arr12.add(54);
		arr12.add(11);
		arr12.add(54);
		arr12.add(11);
		arr12.add(11);
		System.out.println(arr12.indexOf(22)); 
		
//-----------------------------------------------------------------------------

	}
}
