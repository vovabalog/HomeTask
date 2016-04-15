package _HomeTask;
import java.util.Scanner;

public class _08 {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a price:");
		float p = sc.nextFloat();
		if( p >= 1000){
		  System.out.println(("You must pay:")+(float)(p*0.9));
		}else{
			System.out.println("You must pay:"+p);
		}
		
		
	}

}
