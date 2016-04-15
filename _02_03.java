package _HomeTask;

import java.util.Scanner;

public class _02_03 {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		if(a%7 == 0){
			System.out.println("Result:" + (a*2));
		}else{
			System.out.println("Error!");
		}
		
	}

}
