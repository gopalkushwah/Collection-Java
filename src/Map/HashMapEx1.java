package Map;

import java.util.HashMap;

public class HashMapEx1 {

	public static void main(String[] args) {
//		HashMap() - Constructs an empty HashMap with the default initial capacity (16) and the default load factor (0.75).
		
//		HashMap hsm = new HashMap();  //
//		
//		hsm.put(1, 65);
//		hsm.put("name", "anish");
//		hsm.put(true, "value");
//		hsm.put(1.2f, 131.6f);
//		hsm.put(654.5d, 65);
//		
//		System.out.println(hsm);
		
//		*******************************************************************
//		HashMap(int initialCapacity) - Constructs an empty HashMap with the specified initial capacity and the default load factor (0.75).
//		HashMap hsm = new HashMap(10);  //initial capacity of 10
//		hsm.put(1, 65);
//		hsm.put("name", "anish");
//		hsm.put(true, "value");
//		hsm.put(1.2f, 131.6f);
//		hsm.put(654.5d, 65);
//		hsm.put(null, null);
//		
//		System.out.println(hsm);
//		*******************************************************************
//		HashMap(int initialCapacity, float loadFactor) - Constructs an empty HashMap with the specified initial capacity and load factor.
//		HashMap hsm = new HashMap(10,0.5f);  //initial capacity of 10 and load factor 0.5f
//		hsm.put(1, 65);
//		hsm.put("name", "anish");
//		hsm.put(true, "value");
//		hsm.put(1.2f, 131.6f);
//		hsm.put(654.5d, 65);
//		hsm.put(null, null);
//		
//		System.out.println(hsm);
//		*******************************************************************
//		HashMap(Map<? extends K,? extends V> m) - Constructs a new HashMap with the same mappings as the specified Map.
		HashMap hsm = new HashMap(10,0.5f);  //initial capacity of 10 and load factor 0.5f
		hsm.put(1, 65);
		hsm.put("name", "anish");
		hsm.put(true, "value");
		hsm.put(1.2f, 131.6f);
		hsm.put(654.5d, 65);
		hsm.put(null, null);
		System.out.println(hsm);
		
		HashMap hsm1 = new HashMap(hsm);  //initial capacity of 10 and load factor 0.5f
		System.out.println(hsm1);
		hsm1.put(2, 65);
		hsm1.put("Age", 15);
//		
		System.out.println(hsm1);
	}

}
