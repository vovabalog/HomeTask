package _HomeTask;

import java.util.Scanner;
public class _02_01 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a time(0-24):");
		int t = sc.nextInt();
		if(t >= 9 & t <= 18){
			System.out.println("I am at work now!");
		}else{
			System.out.println("I am rest now!");
		}
		
	}

}
