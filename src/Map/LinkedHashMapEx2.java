package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapEx2 {

	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap<>();
		
//		lhm.put(45, 9878);
//		lhm.put(654, 19);
//		lhm.put("dj", 'c');
//		lhm.put(46.5, 9878);
//		lhm.put(true, "4fg");
//		lhm.put(null, true);
//		lhm.put(4.0f, 98);
//		
//		System.out.println(lhm);
//		***************************************************************************
//		void	clear() - Removes all of the mappings from this map.
//		lhm.put(45, 9878);
//		lhm.put(654, 19);
//		lhm.put("dj", 'c');
//		lhm.put(46.5, 9878);
//		lhm.put(true, "4fg");
//		lhm.put(null, true);
//		lhm.put(4.0f, 98);
//		
//		System.out.println(lhm);
//		lhm.clear();
//		System.out.println(lhm);
		
//		***************************************************************************
//		
//		boolean	containsValue(Object value) - Returns true if this map maps one or more keys to the specified value.
//		lhm.put(45, 9878);
//		lhm.put(654, 19);
//		lhm.put("dj", 'c');
//		lhm.put(46.5, 9878);
//		lhm.put(true, "4fg");
//		lhm.put(null, true);
//		lhm.put(4.0f, 98);
////		
//		System.out.println(lhm.containsValue("4fg")); //true
//		System.out.println(lhm.containsValue("4f54g")); //false
//		
//		System.out.println(lhm.containsKey(45)); //true
//		System.out.println(lhm.containsKey(46)); //false
//		
		
		
//		***************************************************************************
//		Set<Map.Entry<K,V>>	entrySet() - Returns a Set view of the mappings contained in this map.
//		
//		lhm.put(45, 9878);
//		lhm.put(654, 19);
//		lhm.put("dj", 'c');
//		lhm.put(46.5, 9878);
//		lhm.put(true, "4fg");
//		lhm.put(null, true);
//		lhm.put(4.0f, 98);
//		Set entry = lhm.entrySet();
//		
//		Iterator it = entry.iterator();
//		while (it.hasNext()) {
//			Map.Entry ent = (Map.Entry) it.next();
//			System.out.println(ent.getKey()+" : "+ent.getValue());
//		}
		
//		***************************************************************************
//		void	forEach(BiConsumer<? super K,? super V> action) - Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
//		
//		lhm.put(45, 9878);
//		lhm.put(654, 19);
//		lhm.put("dj", 'c');
//		lhm.put(46.5, 9878);
//		lhm.put(true, "4fg");
//		lhm.put(null, true);
//		lhm.put(4.0f, 98);
//		lhm.forEach((n,m)->{
//			System.out.println(n+" : "+m);
//		});
//		***************************************************************************
//		V	get(Object key) - Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
//		
//		lhm.put(45, 9878);
//		lhm.put(654, 19);
//		lhm.put("dj", 'c');
//		lhm.put(46.5, 9878);
//		lhm.put(true, "4fg");
//		lhm.put(null, true);
//		lhm.put(4.0f, 98);
//		
//		System.out.println(lhm.get(654));
//		***************************************************************************
//		V	getOrDefault(Object key, V defaultValue) - Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
//		
//		lhm.put(45, 9878);
//		lhm.put(654, 19);
//		lhm.put("dj", 'c');
//		lhm.put(46.5, 9878);
//		lhm.put(true, "4fg");
//		lhm.put(null, true);
//		lhm.put(4.0f, 98);
//		
//		System.out.println(lhm.getOrDefault(45,0));
//		System.out.println(lhm.getOrDefault(46,0));
//		***************************************************************************
//		Set<K>	keySet() - Returns a Set view of the keys contained in this map.
//		
//		lhm.put(45, 9878);
//		lhm.put(654, 19);
//		lhm.put("dj", 'c');
//		lhm.put(46.5, 9878);
//		lhm.put(true, "4fg");
//		lhm.put(null, true);
//		lhm.put(4.0f, 98);
//		Set s= lhm.keySet();
//		System.out.println(s);
//		***************************************************************************
//		protected boolean	removeEldestEntry(Map.Entry<K,V> eldest) - Returns true if this map should remove its eldest entry.
//		
		lhm.put(45, 9878);
		lhm.put(654, 19);
		lhm.put("dj", 'c');
		lhm.put(46.5, 9878);
		lhm.put(true, "4fg");
		lhm.put(null, true);
		lhm.put(4.0f, 98);
		
//		***************************************************************************
//		void	replaceAll(BiFunction<? super K,? super V,? extends V> function) - Replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
//		
//		***************************************************************************
//		Collection<V>	values() - Returns a Collection view of the values contained in this map.	  

	}

}
