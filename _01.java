package _HomeTask;

import java.util.Scanner;

public class _01 {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side a: ");
		int a = sc.nextInt();
		System.out.println("Enter side b:");
		int b = sc.nextInt();
		System.out.println("Enter side c: ");
		int c = sc.nextInt();
		
		int max = a;
		if(max < b){
		   max = b;
		   }
		if(max < c){
		   max = c;
		   }
	
		c = max;
		c = (int)Math.pow(c, 2);
		int sum = (int)(Math.pow(a, 2) + Math.pow(b, 2));
		
		//if (c == (Math.pow(a, 2) + Math.pow(b, 2))){
		if (c == sum){
			
			System.out.println("Priamokytnyj");
		}else{ System.out.println("Bad!");}
		System.out.println("\nc=" + c + "\nb=" +b+ "\na= "+a+"\nsum="+sum);
	
		
		
		
		
		
	}

}
