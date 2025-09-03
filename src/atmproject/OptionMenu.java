
package atmproject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
		Scanner menuInput = new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'₹'###,##0.30");
		
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		HashMap<Integer, String> names = new HashMap<Integer, String>();
			
		
		public void createATM() throws IOException{
		while(true) {
			System.out.println("welcome Everiyone");
			System.out.println("1 - Login");
			System.out.println("2 - Register New Account");
			System.out.println("3 - Exit");
			System.out.println("Choice: ");
			
			int Choice = menuInput.nextInt();
			
			switch (Choice) {
			case 1:
				getLogin();
				break;
				
			case 2:
				registerUser();
				break;
				
			case 3:
				System.out.println("Thank u for using ATM, Goodbye!");
				System.exit(0);
				
			default:
				System.out.println("Invalid Choice \n");
			}
		}
		}
		public void registerUser()throws IOException {
	        System.out.println("------ Register New Account ------");
	        System.out.print("Enter a new Account Number: ");
	        int accNum = menuInput.nextInt();

	        if (data.containsKey(accNum)) {
	            System.out.println("⚠️ Account already exists! Try login.");
	            return;
	        }

	        System.out.print("Enter a new PIN Number: ");
	        int pin = menuInput.nextInt();

	        menuInput.nextLine();
	        System.out.print("Enter your Name: ");
	        String name = menuInput.next();

	        data.put(accNum, pin);
	        names.put(accNum, name);

	        System.out.println("✅ Account Registered Successfully! Please Login.");
	        System.out.println("AccNum: " + accNum);
	        System.out.println("Name: " + name);
	    }

		public void getLogin() throws IOException{
			int x = 1;
			do {
				try {
					//data.put(033445, 7865); //Account number with pin
					data.put(9893147, 7860); //Wakas;
					data.put(9931247, 79886);//Huzaif
					data.put(9831247, 79986);//Arman
					data.put(9891247, 70986);//Zaid
					names.put(9893147, "Wakas");
					
					names.put(9931247, "Huzaifa");
					names.put(9831247, "Arman");
					names.put(9891247, "Zaid");
					
					//System.out.println("===== Welcome to ATM Project 😊 =====");
					System.out.println("Enter your Account Number"  +      " ✍️");
					setCustomerNumber(menuInput.nextInt());
					
					System.out.println("Enter your Card PIN Number"  +      " ✍️");
					setPinNumber(menuInput.nextInt());
				}
				catch(Exception e) {
					System.out.println("\n" + "Invald Character(s).Only Numbers." + "\n");
					menuInput.nextLine();
					x = 2;
				}	
				
				int cn = getCustomerNumber();
				int pn = getPinNumber();
				
				if (data.containsKey(cn) && data.get(cn) == pn) {
					setCustomerName(names.get(cn));
					System.out.println("\n" + "Welcome  to " + getCustomerName());
					getAccountType();
				} else
					System.out.println("\n" + "Wrong Customer or Pin Number"+"\n");
				} while (x == 1);
			}
			
			public void getAccountType() {
				System.out.println("Select the Account you want to Access: ");
				System.out.println("Type 1 - Check your Account");
				System.out.println("Type 2 - Saving Account");
				System.out.println("Type 3 - Exit");
				
				int selection = menuInput.nextInt();
				
				switch (selection){
				case 1:
					getChecking();
					break;
					
				case 2:
					getSaving();
					break;
					
				case 3:
					System.out.println("Thank You for Using this ATM, bye.  \n");
					break;
					
				default:
					System.out.println("\n" + "Invalid choice" + "\n");
					getAccountType();
				}
			}
			
			public void getChecking() {
				System.out.println("Fam Acccount: ");
				System.out.println("type 1 - View Balance");
				System.out.println("type 2 - Withdraw Funds");
				System.out.println("type 3 - Deposit Funds");
				System.out.println("type 4 - Exit");
				System.out.println("Choice: ");
				
				int selection = menuInput.nextInt();
				
				switch (selection) {
				case 1:
					System.out.println("Your Account Balance: " + moneyFormat.format(getCheckingBalance()));
					getAccountType();
					break;
					
				case 2:
					getCheckingWithdrawInput();
					getAccountType();
					break;
					
				case 3:
					getCheckingtDepositInput();
					getAccountType();
					break;
					
				case 4:
					System.out.println("Thank You for using this ATM, bye.");
					break;
					
				default:
					System.out.println("\n" + "Inavlid Choice." + "\n");
					getChecking();
				 }
			}
			
			public void getSaving() {
				System.out.println("Current Acccount: ");
				System.out.println("type 1 - View Balance");
				System.out.println("type 2 - Withdraw Funds");
				System.out.println("type 3 - Deposit Funds");
				System.out.println("type 4 - Exit");
				System.out.println("Choice: ");
				
				int selection = menuInput.nextInt();
				
				switch (selection) {
				case 1:
					System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
					getAccountType();
					break;
					
				case 2:
					getSavingWithdrawInput();
					getAccountType();
					break;
					
				case 3:
					getSavingDepositInput();
					getAccountType();
					break;
					
				case 4:
					System.out.println("Thanl You for using this ATM, bye.");
					break;
					
				default:
					System.out.println("\n" + "Inavlid Choice." + "\n");
					getSaving();
				 }
			}
		}
	