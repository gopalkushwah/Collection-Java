package Map;

import java.util.Comparator;

public class AgeComparatorTreeMap implements Comparator{
	public static void main(String[] args) {
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeTreeMap ageObj1 = (EmployeeTreeMap)o1;
		EmployeeTreeMap ageObj2 = (EmployeeTreeMap)o2;
		if(ageObj1.age > ageObj2.age)
			return 1;
		else if(ageObj1.age<ageObj2.age)
			return -1;
		else return 0;
	}

}
