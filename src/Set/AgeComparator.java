package Set;

import java.util.Comparator;

public class AgeComparator implements Comparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object o1, Object o2) {
		Employee1 obj1 = (Employee1)o1;
		Employee1 obj2 = (Employee1)o2;
		if(obj1.age>obj2.age) 
			return 1;
		else if(obj1.age<obj2.age) 
			return -1;
		else
			return 0;
	}

}
