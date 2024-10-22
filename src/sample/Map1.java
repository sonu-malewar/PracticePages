package sample;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	
	public static void main(String[] args) {
		
		HashMap< Integer, String> hs = new HashMap<>();
		
		hs.put(1, "perl");
		hs.put(2, "Python");
		hs.put(3, "Csharp");
		hs.put(4, "Perl");
		
		System.out.println(hs);
		
		hs.put(null, "Groovy");
		
		System.out.println(hs);
		

		HashMap< Integer, String> hs1 = new HashMap<>();
		hs1.put(6, null);
	
		hs.putAll(hs1);
		
		System.out.println(hs);
		
		System.out.println(hs.get(3)); // get value
		
		System.out.println(hs.remove(4));
		System.out.println(hs);
		
		Set<Integer> sts = hs.keySet();
		
		System.out.println(sts);
		
		Collection<String> end = hs.values();
		
		System.out.println(end);
		
		Iterator<Integer> itr = hs.keySet().iterator();
		
		/*
		 * while (itr1.hasNext()) { Integer in1 = (Integer) itr1.next();
		 * System.out.println(in1); }
		 */
	
     
			
		}

		
		
		
	
	
	

}
