package sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapProg {

	public static void main(String[] args) {

		//to find first non-repeat character

		/*
		 * String str="swiss"; int count=1;
		 * 
		 * Map<Character,Integer> map = new LinkedHashMap<>();
		 * 
		 * for(int i=0;i<str.length()-1;i++) {
		 * 
		 * if(!map.containsKey(str.charAt(i))) {
		 * 
		 * map.put(str.charAt(i), count); } else {
		 * 
		 * map.put(str.charAt(i), map.get(str.charAt(i))+1);
		 * 
		 * 
		 * } }
		 */

		/*
		 * for ( Entry<Character,Integer> entry: map.entrySet()) {
		 * 
		 * 
		 * if(entry.getValue()==1) {
		 * 
		 * System.out.println("" +entry.getKey());
		 * 
		 * break; } }
		 */
	
         // how to find duplicate character in string
		
		String stg = "java";
		
		Map<Character,Integer> map1 = new HashMap<>();
		
		int count1=1;
		
		char[] cstg = stg.toCharArray();
		
		for (char c : cstg) {
			
			if(!map1.containsKey(c)) {
				
				map1.put(c, count1);
			}
			else {
				map1.put(c, map1.get(c)+1);
				
			}
			
		}
                  for (Entry<Character, Integer> ent : map1.entrySet()) {
                	  
                	  if(ent.getValue()>1) {
                		  
                		  System.out.println("" +ent.getKey()+" "+ +ent.getValue());
                	  }
					
				}


	}
}