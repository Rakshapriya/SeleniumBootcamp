package javaprograms;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int count =0;
		while(input>0)
		{
			int reverse = input%10;
			input=input/10;
			System.out.print(reverse);
			count++;
		}
		

	}

}
