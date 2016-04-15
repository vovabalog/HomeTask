package _HomeTask;

import java.util.Scanner;

public class _12 {
	public static void main(String[]args){
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a speed of wind:");
		int s = sc.nextInt();
		if (s >= 1 & s <= 4){
			System.out.println("low wind");
		}
		if (s >= 5 & s <= 10){
			System.out.println("moderate wind");
		}
		if (s >= 11 & s <= 18){
			System.out.println("strong wind");
		}
		if (s >= 19){
			System.out.println("Hurracane");
		}
	}

}
