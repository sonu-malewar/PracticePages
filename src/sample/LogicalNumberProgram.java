package sample;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.HashMap;
import java.util.Iterator;

public class LogicalNumberProgram {

	public static void main(String[] args) {
		
		/*
		 * // Fibonacci number Programme
		 * 
		 * int num1=0; int num2=1;
		 * 
		 * int sum=0;
		 * 
		 * for(int i=2;i<=5;i++) {
		 * 
		 * sum=num1+num2;
		 * 
		 * System.out.println(sum);
		 * 
		 * num1=num2; num2=sum; }
		 */
		//find word in string
		
		String word ="I am Qa";
		int count=1;
	String[] newword = word.split(word);
		
		HashMap hs = new HashMap<String,Integer>();
		
		for(int i=0;i<word.length();i++) {
			
		    hs.put(newword[i], count);
		    
			
		}
		
		
		
		for (Object keys : hs.keySet()) {
			
			System.out.println(hs.get(keys));
			
		}
		
		
		
	}

}
