package _HomeTask;

import java.util.Scanner;

public class _02_06 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		if(a+b > 11 & a+b < 19){
			System.out.println("a+b=" + (a+b));
		}else{
			System.out.println("Error!");
		}
	}

}
