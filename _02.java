package _HomeTask;

import java.util.Scanner;

public class _02 {
	
     public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a: ");
		int a = sc.nextInt();
		System.out.println("Enter  b:");
		int b = sc.nextInt();
		System.out.println("Enter  c: ");
		int c = sc.nextInt();
		

		if (a > 0 & b > 0 & c > 0){
			a = ((int)Math.pow(a, 3));
			b = ((int)Math.pow(b, 3));	
			c = ((int)Math.pow(c, 3));	
		}else{ a = 0; b = 0; c = 0;}
		System.out.println("a= " + a +"\nb= " + b + "\nc= " + c);
		
	
		
		
		
		
		
		
	}

}
