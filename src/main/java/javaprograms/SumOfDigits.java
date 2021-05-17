package javaprograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int input = scan.nextInt();
		
		int sum=0,count=0;
		while(input>0)
		{
			int remaining=input%10; //123%10 = 3
			input =input/10;//123/10=12
			sum=sum+remaining;
			count++;
			
	}
		System.out.println(sum);

	}

}
