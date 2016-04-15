package _HomeTask;
import java.util.Scanner;

public class _09 {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of talks(in minutes; 1min=1grn):");
		int l = sc.nextInt();
		System.out.println("Enter a day of week(1-7):");
		int d = sc.nextInt();
		if(d == 6 | d == 7){
			System.out.println("You must pay:"+((float)(l*0.8)));
		}else{
			System.out.println("You must pay:"+l);
		}
		
	}

}
