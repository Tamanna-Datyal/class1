package CoreJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashset , treeset, linkedset implements set interface
		//set does not accept duplicate values and list can accept duplicate values
		//There is no guarentee that elements store in sequential order they may store in random manner
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("India");
		hs.add("he");
		hs.add("she");
		//hs.remove("Uk");
	    System.out.println(hs);
		//System.out.println(hs.isEmpty());
		//System.out.println(hs.size());
		//System.out.println(hs);
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			
		}
		System.out.println(i.next());
		
	}
}


