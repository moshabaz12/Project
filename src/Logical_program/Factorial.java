package Logical_program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
//		try (Scanner se = new  Scanner(System.in)) {
//			System.out.println("Enter_the_no");
//			int a=se.nextInt();
//					int fact =1;
//			for(int i =1; i<=a;i++) {
////			System.out.println(i);
//				fact=fact * i;
//			}
//System.out.println(fact);
//		}
		
		int sd=5;
		int fact = 1;
		for(int i = 1; i<=sd;i++ ) {
			fact =fact * i;
		}
		System.out.println(fact);
	}

}
