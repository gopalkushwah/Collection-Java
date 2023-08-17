package Map;

import java.util.Comparator;

public class NameComparatorTreeMap implements Comparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeTreeMap empObj1 = (EmployeeTreeMap)o1;
		EmployeeTreeMap emp2Obj1 = (EmployeeTreeMap)o2;
		
		return empObj1.name.compareToIgnoreCase(emp2Obj1.name);
	}

}
