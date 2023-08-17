package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {

	public static void main(String[] args) {
//		LinkedHashMap() - Constructs an empty insertion-ordered LinkedHashMap instance with the default initial capacity (16) and load factor (0.75).
//		LinkedHashMap lhm = new LinkedHashMap();
//		lhm.put(10, 64);
//		lhm.put("df", 64);
//		lhm.put(true, "sdkfj");
//		lhm.put(10.10, false);
//		lhm.put(10.10f, 7878.0d);
//		lhm.put('c', 7878.0d);
//		
//		System.out.println(lhm); //{10=64, df=64, true=sdkfj, 10.1=false, 10.1=7878.0, c=7878.0}
//		
//		******************************************************************************
//		LinkedHashMap(int initialCapacity) - Constructs an empty insertion-ordered LinkedHashMap instance with the specified initial capacity and a default load factor (0.75).
//		LinkedHashMap lhm = new LinkedHashMap(10); //with initial capacity of 10 and defualt load factor of .75
//		lhm.put(10, 64);
//		lhm.put("df", 64);
//		lhm.put(true, "sdkfj");
//		lhm.put(10.10, false);
//		lhm.put(10.10f, 7878.0d);
//		lhm.put('c', 7878.0d);
//		
//		System.out.println(lhm); //{10=64, df=64, true=sdkfj, 10.1=false, 10.1=7878.0, c=7878.0}
//		
//		******************************************************************************
//		LinkedHashMap(int initialCapacity, float loadFactor) - Constructs an empty insertion-ordered LinkedHashMap instance with the specified initial capacity and load factor.
//		LinkedHashMap lhm = new LinkedHashMap(10,0.5f); //with initial capacity of 10 and load factor of .5
//		lhm.put(10, 64);
//		lhm.put("df", 64);
//		lhm.put(true, "sdkfj");
//		lhm.put(10.10, false);
//		lhm.put(10.10f, 7878.0d);
//		lhm.put('c', 7878.0d);
//		
//		System.out.println(lhm); //{10=64, df=64, true=sdkfj, 10.1=false, 10.1=7878.0, c=7878.0}
//	
//		******************************************************************************
//		LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) - Constructs an empty LinkedHashMap instance with the specified initial capacity, load factor and ordering mode.
//		LinkedHashMap lhm = new LinkedHashMap(10,0.5f,true); //with initial capacity of 10 and load factor of .5 
//		lhm.put(10, 64);
//		lhm.put("df", 64);
//		lhm.put(true, "sdkfj");
//		lhm.put(10.10, false);
//		lhm.put(10.10f, 7878.0d);
//		lhm.put('c', 7878.0d);
//		
//		System.out.println(lhm); //{10=64, df=64, true=sdkfj, 10.1=false, 10.1=7878.0, c=7878.0}
//	
//		******************************************************************************
//		LinkedHashMap(Map<? extends K,? extends V> m) - Constructs an insertion-ordered LinkedHashMap instance with the same mappings as the specified map.
		LinkedHashMap lhm = new LinkedHashMap(10,0.5f,true); //with initial capacity of 10 and load factor of .5 
		lhm.put(10, 64);
		lhm.put("df", 64);
		lhm.put(true, "sdkfj");
		lhm.put(10.10, false);
		lhm.put(10.10f, 7878.0d);
		lhm.put('c', 7878.0d);
		LinkedHashMap lhm1 = new LinkedHashMap(lhm); //with initial capacity of 10 and load factor of .5 
		
		System.out.println(lhm1); //{10=64, df=64, true=sdkfj, 10.1=false, 10.1=7878.0, c=7878.0}
//	
//		******************************************************************************

	}

}
