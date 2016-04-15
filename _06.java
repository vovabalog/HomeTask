package _HomeTask;

import java.util.Scanner;

public class _06 {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter speed:");
		float v = sc.nextFloat();
		System.out.println("Enter distance:");
		float s = sc.nextFloat();
		float t = s/v;
		System.out.println("Your time is"+ t );
		
	}

}
