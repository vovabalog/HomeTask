package _HomeTask;

import java.util.Scanner;

public class _04 {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("km/h: ");
		float a = sc.nextFloat();
		System.out.println("m/s:");
		float b = sc.nextFloat();
		float c = (a*1000)/3600;
		if(b > c){
			System.out.println("m/s > km/h");
		}else{
			System.out.println("km/h > m/s");
		}
	}
}
