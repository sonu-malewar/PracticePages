package sample;

import java.util.HashSet;
import java.util.Set;

public class PracticeProg {

	public static void main(String[] args) {

		// Count the substing of string
		String str = "program";

		System.out.println(str=str.substring(4, 7));



		//Count duplicate character occurence in string

		String str1 = "ia am learning java";

		int t1 = str1.replaceAll("a","").length();
		
		int t2 = str1.length();
		
		System.out.println(t2-t1);
		
		
		//How to remove duplicate element in array/String

		int arr[]= {2,5,4,7,6,7,4,1,8,8};

		Set<Integer> hs = new HashSet<>();

		boolean status = false;

		for (Integer a : arr) {

			if((hs.add(a)==false)) {


				//status = false;
				System.out.println("Duplicates not added : " +a);
			}}

		String[] tfd = {"java","python",".net","python","perl"};

		Set<String> hs1 = new HashSet<>();

		boolean status1 = false;

		for (String a1 : tfd) {

			if((hs1.add(a1)==false)) {


				//status = false;
				System.out.println("Duplicates not added : " +a1);
			}}}}