package List;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
//		VectorEx1 obj = new VectorEx1();
//		System.out.println(obj); //List.VectorEx1@2626b418
//		
//		Vector vector1 = new Vector();
//		System.out.println(vector1);  //[]
	
//***************************************************************************
		
//		vector() -- initial capacity is 10 by default and increases by double
//		Vector vector2 = new Vector();
//		System.out.println(vector2.capacity()); //10
//		vector2.add(10);
//		vector2.add(20);
//		vector2.add(30);
//		vector2.add(40);
//		vector2.add(50);
//		vector2.add(60);
//		vector2.add(70);
//		vector2.add(80);
//		vector2.add(90);
//		vector2.add(100);
//		vector2.add(2,110);
////		System.out.println(vector2.capacity()); //20
//		System.out.println(vector2); //[10, 20, 110, 30, 40, 50, 60, 70, 80, 90, 100]
		
//***************************************************************************
//		Vector(int initialCapacity) ---> user can set initial capacity by parameters
		
//		Vector vector2 = new Vector(3);
//		System.out.println(vector2.capacity()); //3
//		vector2.add(10);
//		vector2.add(20);
//		vector2.add(30);
//		
//		vector2.add(40);
//		System.out.println(vector2.capacity()); //6
		
//***************************************************************************
//		Vector(int initialCapacity, int capacityIncrement) ---> user can set initial capacity by parameters
//														   ---> increment value as per the users input
		
//		Vector vector2 = new Vector(3,5);
//		System.out.println(vector2.capacity()); //3
//		vector2.add(10);
//		vector2.add(20);
//		vector2.add(30);
//		
////		vector2.add(10);
////		vector2.add(20);
////		vector2.add(30);
////		
////		vector2.add(10);
////		vector2.add(20);
////		vector2.add(30);
//		
//		vector2.add(40);
//		System.out.println(vector2.capacity()); //3+5 = 8 ----> 8+5 = 13 ----> 13+5 = 18 in this way the capacity will increase
		
//***************************************************************************
//		Vector(Collection<? extends E> c) ---> Constructs a vector containing the elements of the specified collection, in the order they are returned by the collection's iterator.
		
		Vector vector2 = new Vector(3); //initial capacity 3
		vector2.add(10);
		vector2.add(20);
		vector2.add(30);
		System.out.println(vector2);  //[10, 20, 30, 40]
		
		Vector vector3 = new Vector(vector2);  //initial capacity 3
//		System.out.println(vector3.capacity());  // 3
		vector3.add(10);
		vector3.add(20);
		vector3.add(30);
		vector3.add(40);
		vector3.add(50);
		vector3.add(60);
		
		System.out.println(vector3);  //[10, 20, 30, 40, 10, 20, 30, 40, 50, 60]
//		System.out.println(vector3.capacity());  //[10, 20, 30, 40, 10, 20, 30, 40, 50, 60]
		
//***************************************************************************
		
	}

}
