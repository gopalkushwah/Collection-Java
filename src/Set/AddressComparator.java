package Set;

import java.util.Comparator;

public class AddressComparator implements Comparator {

	public static void main(String[] args) {
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		Employee1 obj1 = (Employee1)o1;
		Employee1 obj2 = (Employee1)o2;
		
		return obj1.address.compareToIgnoreCase(obj2.address);
	}

}
