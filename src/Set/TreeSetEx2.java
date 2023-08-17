package Set;

import java.util.Iterator;
import java.util.TreeSet;

class Employee5 implements Comparable{
	int age;
	String name,address;

	Employee5(int age,String name,String address){
		this.address = address;
		this.age = age;
		this.name = name;
	}

//	@Override
//	public int compareTo(Object o) {
////		Object o is Employee5 type of object so we need to downcast it 
//		Employee5 e = (Employee5)o;
//		if(this.age>e.age) 
////			for ascending
//			return 1;
//			
////			for descending
////			return -1;
//			
//		else if(this.age<e.age) 
//			return -1;
//			
////			return 1;
//		else
//			return 0;
//	}

	@Override
	public int compareTo(Object o) {
		Employee5 e = (Employee5)o;
		return this.name.compareToIgnoreCase(e.name);
	}
	
	@Override
	public String toString() {
		return age + " " + name + " " + address ;
	}

	
}
public class TreeSetEx2 {

	public static void main(String[] args) {
		Employee5 e1 = new Employee5(25, "Gopal", "Indore");
		Employee5 e2 = new Employee5(20, "anish", "bhopal");
		Employee5 e3 = new Employee5(15, "harsh", "bhopal");
		Employee5 e4 = new Employee5(60, "ritik", "jaipur");
		Employee5 e5 = new Employee5(30, "sandip", "banglore");
		Employee5 e6 = new Employee5(30, "sandip", "banglore");
	
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		
//		before implementation of Comparable interface
//		System.out.println(t); // it will throw an exception  - java.lang.ClassCastException
//							   // Employee5 class must implement the Comparable interface

//		after implementation of Comparable interface
//		System.out.println(t);  //[Set.Employee5@5a07e868] 
//								// now we need to write the sorting code inside the compareTo method
		
//		after writing of sorting logic
//		System.out.println(t);   //[Set.Employee5@5a07e868, Set.Employee5@76ed5528, Set.Employee5@2c7b84de, Set.Employee5@3fee733d, Set.Employee5@5acf9800]
	
//	    after overriding the toString Method
//		System.out.println(t);  // [15 harsh bhopal, 20 anish bhopal, 25 Gopal Indore, 30 sandip banglore, 60 ritik jaipur]
	
		Iterator it = t.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		
//		Iterator it = t.descendingIterator();
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			System.out.println(object);
//		}
		
		
	}
}
