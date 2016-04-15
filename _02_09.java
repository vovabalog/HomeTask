package _HomeTask;

import java.util.Scanner;

public class _02_09 {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3-digit number:");
		//System.out.println("Enter a number:");
		int i = sc.nextInt();
        int n = 0 , a = i%10 , b=(i/10)%10 , c=i/100;
        //System.out.println("a = "+a+"\nb = "+b+"\nñ = "+c);
        
        if((c == 5)| (b == 5)|(a == 5)){
        	 n++;
            }
           
        if(n > 0){
        	System.out.println("We have 5 in this number  " + n + " times");
        }
	}

}
