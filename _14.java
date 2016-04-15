package _HomeTask;

import java.util.Scanner;

public class _14 {
	public static void main(String[]args){
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
        int a = i%10, b=(i/10)%10,c=(i/100)%10, d=(i/1000)%10, e=(i/10000)%10, f=(i/100000)%10;
        if (a+b+c == d+e+f){
        	System.out.println("Nummber is lucky!");
        }else{
        	System.out.println("Number is not lucky!");
        }
        
        	
		
	}

}
