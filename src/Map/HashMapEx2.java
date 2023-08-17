package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String,String>();
//		*************************************************************
//		V	put(K key, V value)
//		Associates the specified value with the specified key in this map.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		System.out.println(hm);
//		*************************************************************
		
//		void	clear()
//		Removes all of the mappings from this map.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		System.out.println(hm); //{1=Anish, 12=Gopal, 45=Vipin, 1321=girraj, 64=Sumit, 21=Kapil, 65=Sourbh}
//		hm.clear();
//		System.out.println(hm); //{}
		
//		*************************************************************
//
//		Object	clone()
//		Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		System.out.println(hm); //{1=Anish, 12=Gopal, 45=Vipin, 1321=girraj, 64=Sumit, 21=Kapil, 65=Sourbh}
//		Object hm1 = hm.clone();
//		System.out.println(hm1); //{1=Anish, 12=Gopal, 45=Vipin, 1321=girraj, 64=Sumit, 21=Kapil, 65=Sourbh}
//		*************************************************************

//		boolean	containsKey(Object key)
//		Returns true if this map contains a mapping for the specified key.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		System.out.println(hm.containsKey("1321")); //true
//		System.out.println(hm.containsKey("13")); //false
//		*************************************************************
		
//		boolean	containsValue(Object value)
//		Returns true if this map maps one or more keys to the specified value.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		System.out.println(hm.containsValue("Gopal")); //true
//		System.out.println(hm.containsValue("sdhj")); //false
//		*************************************************************
//
//		Set<Map.Entry<K,V>>	entrySet()
//		Returns a Set view of the mappings contained in this map.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		Set s= hm.entrySet();
//		Iterator it = s.iterator();
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			System.out.println(object);
//			System.out.println(object.getClass().getSimpleName()); //Node
//		}
//		*************************************************************
//		void	forEach(BiConsumer<? super K,? super V> action)
//		Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		hm.forEach((k,v)->{
//			System.out.println("key - "+k+", value - "+v);
//		});
//		*************************************************************
//		V	get(Object key)
//		Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		System.out.println(hm.get("21")); //kapil
//		*************************************************************
//		V	getOrDefault(Object key, V defaultValue)
//		Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
		
//		System.out.println(hm.getOrDefault("21","dskhsdjk")); //kapil
//		System.out.println(hm.getOrDefault("dsfjjhk","girraj")); //girraj
//		*************************************************************
//		boolean	isEmpty()
//		Returns true if this map contains no key-value mappings.
//		System.out.println(hm.isEmpty()); //true
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		System.out.println(hm.isEmpty()); //false
//		*************************************************************
//		Set<K>	keySet()
//		Returns a Set view of the keys contained in this map.
//
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		Set s = hm.keySet();
//		Iterator it = s.iterator();
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			System.out.println(object);
//		}
//		*************************************************************
//		V	merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
//		If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.

//		*************************************************************
//		void	putAll(Map<? extends K,? extends V> m)
//		Copies all of the mappings from the specified map to this map.
//
//		*************************************************************
//		V	putIfAbsent(K key, V value)
//		If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.

//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		HashMap<String, String> hm1 = new HashMap<String,String>();
//		hm1.putAll(hm);
//		System.out.println(hm);
//		System.out.println(hm1);
//		*************************************************************
//		V	remove(Object key)
//		Removes the mapping for the specified key from this map if present.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		System.out.println(hm.remove("64")); //sumit
//		System.out.println(hm);
		
//		*************************************************************
//		boolean	remove(Object key, Object value)
//		Removes the entry for the specified key only if it is currently mapped to the specified value.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		System.out.println(hm.remove("64","Sumit")); //true
//		System.out.println(hm);
//		*************************************************************
//		V	replace(K key, V value)
//		Replaces the entry for the specified key only if it is currently mapped to some value.

//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		System.out.println(hm.replace("64","Rajesh")); //Sumit
//		System.out.println(hm); //{1=Anish, 12=Gopal, 45=Vipin, 1321=girraj, 64=Rajech, 21=Kapil, 65=Sourbh}

//		*************************************************************
//		boolean	replace(K key, V oldValue, V newValue)
//		Replaces the entry for the specified key only if currently mapped to the specified value.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		System.out.println(hm.replace("64","Sumit","Ramesh")); //true
		
//		*************************************************************
//		void	replaceAll(BiFunction<? super K,? super V,? extends V> function)
//		Replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
//		 HashMap<String, Integer> hm2 = new HashMap<>();
//	     hm2.put("Tushar", 2000);
//	     hm2.put("Anushka", 2001);
//	     hm2.put("Sanskriti", 2003);
//	     hm2.put("Anuj", 2002);
//	     
//	     hm2.replaceAll((key, yearOfBirth)-> 2023 - yearOfBirth);
//	     System.out.println(hm2);
		
//		*************************************************************
//		int	size()
//		Returns the number of key-value mappings in this map.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		
//		System.out.println(hm.size()); //7
//		*************************************************************
//		Collection<V>	values()
//		Returns a Collection view of the values contained in this map.
//		hm.put("1", "Anish");
//		hm.put("12", "Gopal");
//		hm.put("1321", "girraj");
//		hm.put("64", "Sumit");
//		hm.put("21", "Kapil");
//		hm.put("65", "Sourbh");
//		hm.put("45", "Vipin");
//		System.out.println(hm.values());
//		hm.values().forEach(n->{
//			System.out.println(n);
//		});
//		*************************************************************
	}

}
