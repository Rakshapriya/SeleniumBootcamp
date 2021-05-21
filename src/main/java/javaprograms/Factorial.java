package javaprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int fact =1;
		for(int i=1;i<=input;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
