package _HomeTask;

import java.util.Scanner;

public class _02_02 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		System.out.println("Enter c:");
		int c = sc.nextInt();
		int max = a;
		
		if(max < b){
		   max = b;
		   }
		if(max < c){
		   max = c;
		   }
		System.out.println("Max=" + max);
		int min = a;
		if(min > b){
		   min = b;
		   }
		if(max > c){
		   max = c;
		   }
		System.out.println("Min=" + min);
	
	}

}
