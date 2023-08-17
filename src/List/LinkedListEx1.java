package List;

import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
//		LinkedList()
		
//		LinkedList lnl = new LinkedList();  //it will not receive any value
//		lnl.add(10);
//		lnl.add(30);
//		lnl.add(20);
//		lnl.add(60);
//		lnl.add(50);
//		System.out.println(lnl);  //[10, 30, 20, 60, 50]
		
//		**************************************************************************
		
//		LinkedList(Collection<? extends E> c)
		
//		LinkedList lnl = new LinkedList();  //it will receive argument
//		lnl.add(10);
//		lnl.add(30);
//		lnl.add(20);
//		lnl.add(60);
//		lnl.add(50);
//		System.out.println(lnl);  //[10, 30, 20, 60, 50]
//		LinkedList lnl1 = new LinkedList(lnl);  //it will receive argument
//		lnl1.add(10);
//		lnl1.add(30);
//		lnl1.add(20);
//		lnl1.add(60);
//		lnl1.add(50);
//		System.out.println(lnl1);  //[10, 30, 20, 60, 50, 10, 30, 20, 60, 50]
//		
//		**********************************************************************

//		LinkedList can have multiple "null" values 
		
		LinkedList lnl = new LinkedList();  
		lnl.add(null);
		lnl.add(null);
		lnl.add(null);
		lnl.add(null);
		lnl.add(null);
		lnl.add(null);
		lnl.add(null);
		System.out.println(lnl);  //[10, 30, 20, 60, 50]

		
		
	}

}
