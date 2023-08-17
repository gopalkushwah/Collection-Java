package Set;

import java.util.Comparator;

public class NameComparator implements Comparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object o1, Object o2) {
		Employee1 obj1 = (Employee1)o1;
		Employee1 obj2 = (Employee1)o2;
		
		return obj1.name.compareToIgnoreCase(obj2.name);
	}

}
