package _HomeTask;

import java.util.Scanner;

public class _07 {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of month(1-12): ");
		int a = sc.nextInt();
		if(a == 1 | a == 2 | a == 12){
			System.out.println("Winter");
		}
		if(a == 3 | a ==4 | a == 5 ){
			System.out.println("Spring");
		}
		if(a == 6 | a == 7 | a == 8){
			System.out.println("Summer");
		}
		if(a == 9 | a == 10 | a == 11){
			System.out.println("Autumn");
		}
		if(a == 0 | a > 12){
			System.out.println("Error!");
		
		}
	}

}
