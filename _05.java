package _HomeTask;

import java.util.Scanner;

public class _05 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a:");
		int a = sc.nextInt();
		System.out.println("b:");
		int b = sc.nextInt();
		System.out.println("c:");
		int c = sc.nextInt();
		
		if(a == b | a == c | b == c ){
			System.out.println("Da!");
		}else{
			System.out.println("Net!");
		}
		
	}

}
