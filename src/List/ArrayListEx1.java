package List;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
//		ArrayListEx1 obj = new ArrayListEx1();
//		System.out.println(obj); //List.ArrayListEx1@2626b418
		
		
//		its initial capacity is 10
//		public ArrayList()
		ArrayList arrList = new ArrayList();
//		System.out.println(arrList); //[]
		arrList.add(10);
		arrList.add("Gopal");
		arrList.add(true);
		arrList.add(10.6);
		System.out.println(arrList); //[10, Gopal, true, 10.6]
		
//		-----------------------------------------------------------------------
//		its initial capacity is 2 as be are passing by the constructor	
//		public ArrayList(int initialCapacity)
		ArrayList arrList1 = new ArrayList(2);
		arrList1.add(20);
		arrList1.add("Anish");
		arrList1.add(false);
		arrList1.add(20.6);
		System.out.println(arrList1);
		
//		-----------------------------------------------------------------------
		ArrayList arrList2 = new ArrayList(arrList1);
//		public ArrayList(Collection<? extends E> c)
		arrList2.add(30);
		arrList2.add("satyam");
		arrList2.add(true);
		arrList2.add(30.6);			//--------arrList1-------- ,----------arrList2-----
		System.out.println(arrList2); //[20, Anish, false, 20.6, 30, satyam, true, 30.6]
		
//
	}

}
