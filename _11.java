package _HomeTask;

import java.util.Scanner;
public class _11 {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number(0-99):");
		int a = sc.nextInt();
		if(a == 1){
			System.out.println(a + " kopejka");
		}
		if(a >= 2 & a <= 4){
			System.out.println(a + " kopejki");
		}
		if(a >= 5 & a <=20){
			System.out.println(a + " kopeek");
		}
		if(a%10 == 1){
			System.out.println(a + " kopejka");
		}
		if(a%10 >= 2 & a%10 <= 4 ){
			System.out.println(a + " kopejki");
		}
		if(a%10 >= 5 & a%10 <= 9 ){
			System.out.println(a + " kopeek");
		}
		
	}

}
