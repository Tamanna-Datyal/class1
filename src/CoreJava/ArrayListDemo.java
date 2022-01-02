package CoreJava;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Tanu");
		a.add("Tamanna");
		a.add("Mani");
		a.add("Mani");
		a.add(0,"Komal");
		
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		System.out.println(a.contains("Reema"));
		System.out.println(a.indexOf("Tanu"));

		//System.out.println(a.isEmpty());
	 System.out.println(a);
	}

}
