package _HomeTask;
import java.util.Scanner;

public class _03 {

	public static void main(String[]args){
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
        int a = i%10, b=(i/10)%10,c=i/100;
        System.out.println("a = "+a+"\nb = "+b+"\nñ = "+c);
        if((a==b)||(a==c)||(b==c))
            System.out.println("We have the same numbers!");
        else
            System.out.println("The same numbers is absent!");
		}
		
	}

