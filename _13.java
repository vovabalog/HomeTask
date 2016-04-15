package _HomeTask;

import java.util.Scanner;

public class _13 {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		System.out.println("Enter c:");
		int c = sc.nextInt();
		if(a+b+c > 0){
			System.out.println("a="+(a*a) + "\nb=" + (b*b) + "\nc=" + (c*c));
		}else{
			System.out.println("a=" + (a = 0) + "\nb=" + (b = 0) + "\nc=" + (c = 0));
		}
	}

}
