package _HomeTask;

import java.util.Scanner;

public class _15 {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a square of quadrate:");
		float s1 = sc.nextFloat();
		System.out.println("Enter a square of circle:");
		float s2 = sc.nextFloat();
		double r = Math.sqrt(s2/3.14);
		double a = Math.sqrt(s1);
		if(r == (a/2)){
			System.out.println("We can input circle in a quadrate!");
		}else{
			System.out.println("We can't input circle in a quadrate!");
		}
		
		
		
	}

}
