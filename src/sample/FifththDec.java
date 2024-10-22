package sample;

import java.util.Iterator;

public class FifththDec {
	
	public static void main(String[] args) {
		
		
		// write for reverse number and string
		
		String s= "Geometry";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			String rev = "";
			rev=rev+s.charAt(i);
			
			System.out.println(rev);
			
			
		}
		int num =1234;
		
		
		while(num>0) {
			int rev1=0;
			
			rev1=rev1+num%10;
			
			num=num/10;
			
			System.out.println(rev1);
			
			
			
			}
		
		
		
		
	}

}
