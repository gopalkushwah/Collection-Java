package List;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		System.out.println(System.nanoTime());
		long firstTime = System.nanoTime();
		for(int i = 0;i<100000;i++) {
			arrList.add(i);
		}
		long lastTime = System.nanoTime();
		System.out.println(System.nanoTime());
		long totalTime = lastTime - firstTime;
		System.out.println("Total time for array list : "+totalTime);
		
		System.out.println("**********************************************");
		
//		Add method of linked list is faster then array list
		
		System.out.println(System.nanoTime());
		firstTime = System.nanoTime();
		for(int i = 0;i<100000;i++) {
			arrList.add(i);
		}
		lastTime = System.nanoTime();
		System.out.println(System.nanoTime());
		totalTime = lastTime - firstTime;
		System.out.println("Total time for linked list : "+totalTime);
		
//		**********************************************************
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println(System.nanoTime());
		firstTime = System.nanoTime();
		for(int i = 0;i<100000;i++) {
			arrList.get(i);
		}
		lastTime = System.nanoTime();
		System.out.println(System.nanoTime());
		totalTime = lastTime - firstTime;
		System.out.println("Total time for array list : "+totalTime);
		
		System.out.println("**********************************************");
		
//		get method of array list is faster then linked list
		
		System.out.println(System.nanoTime());
		firstTime = System.nanoTime();
		for(int i = 0;i<100000;i++) {
			arrList.get(i);
		}
		lastTime = System.nanoTime();
		System.out.println(System.nanoTime());
		totalTime = lastTime - firstTime;
		System.out.println("Total time for linked list : "+totalTime);
		
		
	}
}
