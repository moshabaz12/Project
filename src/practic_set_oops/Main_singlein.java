package practic_set_oops;



class Vehical{
	void start() {
		System.out.println("vehical is started");
	}
}

class Bike extends Vehical{
	void display() {
		System.out.println("vehical is runnig");
	}
}
public class Main_singlein {
	public static void main(String[] args) {
		Bike h3 = new Bike();
		h3.start();
		h3.display();
		
	}

}
