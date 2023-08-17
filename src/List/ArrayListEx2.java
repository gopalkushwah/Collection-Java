package List;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
//				 <Generic>
		ArrayList<String> arr = new ArrayList<String>(); //it will store only String type of data
		
		arr.add("gopal");
		arr.add("Anish");
		arr.add("Girraj");
		arr.add("Sumit");
		arr.add("Manish");
//		arr.add(2); //error
		System.out.println(arr); //[gopal, Anish, Girraj, Sumit, Manish]
		
		
//		Integer type data only
		ArrayList<Integer> arr1 = new ArrayList<Integer>(); //it will store only Integer type of data
		arr1.add(22);
		arr1.add(455);
		arr1.add(65);
//		arr1.add("Sumit"); //error
		arr1.add(646);
		System.out.println(arr1); //[22, 455, 65, 646]
		
	}

}
