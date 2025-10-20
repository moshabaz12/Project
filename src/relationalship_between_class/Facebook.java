package relationalship_between_class;

import java.util.Scanner;

public class Facebook {
	public static void main(String[] args) {
	Scanner ne = new Scanner(System.in);
	String savedEmail = "shabaz";
	String  savedPassword ="1234";
	System.out.println("<<===Facebook login page===>>");
	System.out.println("<<==Enter Email or phone==>>");
    String email = ne.nextLine();
    
System.out.println("Enter password :");
String password = ne.nextLine();

// Check condition
if (email.equals(savedEmail) && password.equals(savedPassword)) {
    System.out.println("\n✅ Login Successful! Welcome to Facebook.");
} else {
    System.out.println("\n❌ Invalid Email or Password!");
}

ne.close();
	}

}
