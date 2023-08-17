package Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Employee1{
	int age;
	String name,address;

	Employee1(int age,String name,String address){
		this.address = address;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + " " + name + " " + address ;
	}

	
}
public class TreeSetEx3 {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(25, "Gopal", "Indore");
		Employee1 e2 = new Employee1(20, "anish", "bhopal");
		Employee1 e3 = new Employee1(15, "harsh", "bhopal");
		Employee1 e4 = new Employee1(60, "ritik", "jaipur");
		Employee1 e5 = new Employee1(30, "sandip", "banglore");
		Employee1 e6 = new Employee1(30, "sandip", "banglore");
	
		Comparator c;
		int n = 0;
		if(n==1)
			c = new NameComparator();
		else if(n==-1)
			c = new AgeComparator();
		else 
			c = new AddressComparator();
		
		TreeSet t = new TreeSet(c);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		
		Iterator it = t.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
	}

}
