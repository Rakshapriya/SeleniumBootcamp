package javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.testng.collections.Maps;

public class CharOccurencesCount {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		 String string = scan.nextLine();
		 
		 char[] charArray = string.toCharArray();
		 HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		 
		 for(char ch:charArray) {
			 if(map.containsKey(ch)) {
				 map.put(ch, map.get(ch)+1);
			 }else {
				 map.put(ch,1);
			 }
		 }
		 
		 for( Map.Entry entry : map.entrySet()) {
			 
			 System.out.println(entry.getKey()+"="+entry.getValue());
			 
			 }
		 for( Map.Entry entry : map.entrySet()) {
			 
			 System.out.print(entry.getKey());
			 System.out.print(entry.getValue());
			 
		 }

	}

}
