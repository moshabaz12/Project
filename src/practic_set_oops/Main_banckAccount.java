package practic_set_oops;

// encapsulation in java 
class BankAccount{
	private int  balance ;
	public void setbalance(int ammount ) {
		balance = ammount ;
	}
	public int getbalance() {
		return balance;
	}
}
public class Main_banckAccount {
	public static void main(String[] args) {
		
		BankAccount h1 = new BankAccount();
		h1.setbalance(8000);
		System.out.println("Balance :"+h1.getbalance());
		
	}

}
