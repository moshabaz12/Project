package relationalship_between_class;

interface Tata {
	void showTata();

}

interface huzaifa extends Tata {
	void runhuzaifa();
}

interface Birla {
	void showBirla();
}

class We implements huzaifa, Birla {
	public void showTata() {
		System.out.println("Car");
	}

	public void runhuzaifa() {
		System.out.println("Sements");
	}

	public void showBirla() {
		System.out.println("AmbojaSeement");
	}
}

public class HybridInheritance {
	public static void main(String[] args) {

		We oo = new We();
		oo.runhuzaifa();
		oo.showBirla();
		oo.showTata();
	}

}
