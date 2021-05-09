package javaprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input string");
		String string = scan.next();
		
		  for(int i=(string.length())-1;i>=0;i--)
		{
			System.out.print(string.charAt(i));
		}
	
		}

}
