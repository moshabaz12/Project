package Logical_program;

import java.util.Scanner;

public class Leap_yers1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   // Create Scanner object
        System.out.print("Enter a number: ");
        int yers = sc.nextInt();  
		
		if((yers%400==0)||(yers %4==0 && yers%100!=0)) {
			System.out.println("leap yers ");
		}else {
			System.out.println("not a leap yers ");
		}
	}

}
