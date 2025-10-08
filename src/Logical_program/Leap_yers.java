package Logical_program;

import java.util.Scanner;

public class Leap_yers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   // Create Scanner object
		
        System.out.print("Enter a number: ");
        int r = sc.nextInt();  
		
int yers = 2016;
if(yers%4==0) {
	
	if(yers% 100==0) {
		if(yers %400==0) {
			System.out.println(" leap yers ");
		}else {

			System.out.println("Not a leap yers  ");
			
		}
	}else {
		System.out.println("leap yers ");
	}
}else {
	System.out.println("Not a leap yers  ");
}
	}

}
