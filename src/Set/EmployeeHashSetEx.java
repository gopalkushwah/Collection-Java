package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee{
	int id;
	String name,address;
	
	Employee(int id,String name,String address){
		this.id=id;
		this.name = name;
		this.address = address;
	}
	
	void show() {
		System.out.println(id+" "+name+" "+address);
	}
	
	
	@Override
	public int hashCode() {
		return id*10;
	}
	
	@Override
	public boolean equals(Object o) {
		Employee e = (Employee)o;
		if(this.id==e.id) 
			return true;
		else
			return false;
	}
	
	public String toString() {
		return id+" "+name+" "+address;
	}
}

public class EmployeeHashSetEx {

	public static void main(String[] args) {
		Set<Employee> st = new HashSet<Employee>();
		
		Employee e1 = new Employee(1000, "Gopal", "chorsakhedi");
		Employee e2 = new Employee(2000, "Vipin", "Bandi");
		Employee e3 = new Employee(3000, "Sourbh", "Chippaner");
		Employee e4 = new Employee(1000, "Gopal", "chorsakhedi");
		
		st.add(e1);
		st.add(e2);
		st.add(e3);
		st.add(e4);
		
		Iterator<Employee> i = st.iterator();
		
		while (i.hasNext()) {
			Employee type = (Employee) i.next();
			type.show();
		}
		
//		System.out.println(e1.hashCode()); 
//		System.out.println(e2.hashCode());
//		System.out.println(e3.hashCode());
//		System.out.println(e4.hashCode());
		
//		System.out.println(e1); 
//		System.out.println(e2);
//		System.out.println(e3);
//		System.out.println(e4);
		
//		to remove the data duplicacy override the method of Object class
//		hashCode method
//		equals method
//		toString method 
	}

}
