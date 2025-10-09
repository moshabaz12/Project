package Logical_program;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
//		user input 
		
try (Scanner s = new Scanner(System.in)) {
	System.out.println("Enter_name");
	String name  =s.next();
	System.out.println("Enter_ Gender");
	String gender=s.next();
	System.out.println("Enter_Age");
	int age=s.nextInt();
	System.out.println("Enter_phone");
	long phone=s.nextLong();
	
	System.out.println("name : "+name+"  : "+gender+" : "+age+" : "+phone);
}
	}

}
