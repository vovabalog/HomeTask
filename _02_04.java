package _HomeTask;

import java.util.Scanner;

public class _02_04 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number with floating point:");
		float a = sc.nextFloat();
		if(a > 0 & a < 1){
			System.out.println("Good");
		}else{
			System.out.println("Error");
		}
	}

}
