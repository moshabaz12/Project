package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Account {
	 
	 private int customerNumber;
	 private int pinNumber;
	 private String customerName;
	 private double chekingBalance = 80000;
	 private double savingBalance = 90000;
	 
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'₹'###,##0.00");
	
	
	

	
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	
	public String setCustomerName(String  Name) {
		this.customerName = Name;
		return Name;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	
   

	public double getCheckingBalance() {
		return chekingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double calcCheckingWithdraw(double amount) {
		chekingBalance = (chekingBalance - amount);
		return chekingBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		chekingBalance = (chekingBalance + amount);
		return chekingBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(chekingBalance));
		System.out.println("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if ((chekingBalance - amount) >=0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(chekingBalance));
		} else {
			System.out.println("Balance cannot be Negative." + "\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from Saving Account: ");
		double amount = input.nextDouble();
		
		if ((savingBalance - amount) >=0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance cannot be Negative." + "\n");
		}
	}
	
	public void getCheckingtDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(chekingBalance));
		System.out.println("Amount you want to deposit from current Account: ");
		double amount = input.nextDouble();
		
		if ((chekingBalance + amount) >=0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(chekingBalance));
		} else {
			System.out.println("Balance cannot be Negative." + "\n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposit from current Account: ");
		double amount = input.nextDouble();
		
		if ((savingBalance + amount) >=0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance cannot be Negative." + "\n");
		}
	}	
}