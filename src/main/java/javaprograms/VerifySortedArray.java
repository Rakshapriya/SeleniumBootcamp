package javaprograms;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.tools.ant.types.resources.Last;

public class VerifySortedArray {
	
	static boolean isSorted(int[] arr,int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++) {
				
			if(arr[i]<arr[j])
			{
				return true;
			}
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		int arr[]= {20,30,40,50,60};
		
		int n = arr.length;
		
		System.out.println(isSorted(arr,n));
		
		
	
		
		
		
		

	}

}
