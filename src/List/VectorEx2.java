package List;

import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
//		v1.add("Ram"); //error
		
		System.out.println(v1); //[10, 20, 30, 40, 50]
//***************************************************************************

		Vector<String> v2 = new Vector<String>();
		v2.add("Ram");
		v2.add("Shayam");
		v2.add("Mohan");
		v2.add("Rohan");
		v2.add("sohan");
		v2.add("Ganesh");
		v2.add("Gopal");
//		v2.add(12); //error
		System.out.println(v2); //[Ram, Shayam, Mohan, Rohan, sohan, Ganesh, Gopal]
//***************************************************************************
		Vector<Boolean> v3 = new Vector<Boolean>();
		v3.add(true);
		v3.add(true);
		v3.add(false);
		v3.add(true);
		v3.add(false);
		v3.add(false);
		System.out.println(v3); //[true, true, false, true, false, false]
//***************************************************************************
		Vector<Float> v4 = new Vector<Float>();
//***************************************************************************
		Vector<Double> v5 = new Vector<Double>();
//***************************************************************************
		Vector<Character> v6 = new Vector<Character>();
//***************************************************************************
		Vector<Long> v7 = new Vector<Long>();
//***************************************************************************
		Vector<Byte> v8 = new Vector<Byte>();
		
		
		
	}

}
