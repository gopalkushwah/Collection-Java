package Map;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class EmployeeTreeMap implements Comparable{
	int age;
	String name,address;
	
	EmployeeTreeMap(int age,String name,String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}
	
	public String toString() {
		return age+" "+name+" "+address;
	}

	@Override
	public int compareTo(Object o) {
		EmployeeTreeMap em = (EmployeeTreeMap)o;
		
//		for age sorting 
		if(em.age>this.age)
			return 1;
		else if(em.age<this.age) 
			return -1;
		else 
			return 0;
		
//		for name sorting
//		return em.name.compareToIgnoreCase(this.name);
	}
}

public class TreeMapEx1 {

	public static void main(String[] args) {
//		TreeMap() - Constructs a new, empty tree map, using the natural ordering of its keys.
//		
//		TreeMap tm = new TreeMap<>();
//		tm.put(12, 65);
//		tm.put(646, 46);
//		tm.put(8, 545);
//		tm.put(92, 87);
//		tm.put(18, 79);
////		tm.put("fh", 31); // java.lang.ClassCastException
//		System.out.println(tm);
		
//		*************************************************************************
//		TreeMap(Comparator<? super K> comparator) - Constructs a new, empty tree map, ordered according to the given comparator.
//		
		EmployeeTreeMap e1 = new EmployeeTreeMap(25, "Gopal", "Indore");
		EmployeeTreeMap e2 = new EmployeeTreeMap(20, "anish", "bhopal");
		EmployeeTreeMap e3 = new EmployeeTreeMap(15, "harsh", "bhopal");
		EmployeeTreeMap e4 = new EmployeeTreeMap(60, "ritik", "jaipur");
		EmployeeTreeMap e5 = new EmployeeTreeMap(30, "sandip", "banglore");
		EmployeeTreeMap e6 = new EmployeeTreeMap(30, "sandip", "banglore");
		Comparator c;
//		int n = 0;
//		if(n == 0)
//			c = new NameComparatorTreeMap();
//		else if(n == 1) 
//			c = new AgeComparatorTreeMap();
		
		TreeMap tm = new TreeMap(Collections.reverseOrder());
		tm.put(e1, null);
		tm.put(e2, null);
		tm.put(e3, null);
		tm.put(e4, null);
		Set s = tm.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry ) it.next();
			System.out.println(entry.getKey());
		}
//		System.out.println(tm);
//		*************************************************************************
//		TreeMap(Map<? extends K,? extends V> m) - Constructs a new tree map containing the same mappings as the given map, ordered according to the natural ordering of its keys.
//		
//		*************************************************************************
//		TreeMap(SortedMap<K,? extends V> m) - Constructs a new tree map containing the same mappings and using the same ordering as the specified sorted map.
		
//		*************************************************************************
	}

}
