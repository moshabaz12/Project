package Logical_program;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
//		wap to check for even or odd
		
		 Scanner sc = new Scanner(System.in);   // Create Scanner object
		
	        System.out.print("Enter a number: ");
	        int r = sc.nextInt();   // Take integer input from user
		
int r1= 90;
if( r1%2==0) {
	System.out.println("number is even");
}else {
	System.out.println("number is odd");
}
		
sc.close();
	}

}
