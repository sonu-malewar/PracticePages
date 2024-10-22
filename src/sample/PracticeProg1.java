package sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class PracticeProg1 {

	public static void main(String[] args) {


		String str ="laptop";

		// find duplicate chaacter


		char[] var = str.toCharArray();

		System.out.println(var);

		HashMap<Character, Integer> mp =new HashMap<>();
		int count=1;

		for(int i=0;i<str.length();i++)
		{
			if(!mp.containsKey(var[i])) {

				mp.put(var[i], count);
			}
			else {

				mp.put(var[i], mp.get(var[i])+1);
			}

		}

           for (Entry<Character, Integer> entry : mp.entrySet()) {
        	   if(entry.getValue()>1)
        	   {
        		   System.out.println("duplicate key is"   + entry.getKey()  +"and value is"+ entry.getValue());
        	   }
        	   
        	   
        	   //System.out.println(entry);
			
		}
           


	}











}


