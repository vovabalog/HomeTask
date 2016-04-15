package _HomeTask;

import java.util.Scanner;

public class _02_07 {
	public static void main(String[]args){
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		if(a%b == 0 | b%a == 0 ){
			if(a%b == 0){
			System.out.println("true: " + (a/b) + "   " + (a%b));
			}
			if(b%a == 0){
			System.out.println("true: " + (b/a) + "   " + (b%a));	
			}
		}else{
			if(a%b != 0){
			System.out.println("false:" + (a/b) + "   " + (float)(a%b));
			}
			if (b%a != 0){
			System.out.println("false:" + (b/a) + "   " + (b%a));	
			}
		}
		
		
	}

}
