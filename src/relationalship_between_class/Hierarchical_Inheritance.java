package relationalship_between_class;
// Hierarchical_Inheritance    
class BigSell {
	void sell() {
		System.out.println("sell offer market");
	}
}

class Mashin extends BigSell {
	void mas() {
		System.out.println("how musch price ");
	}
}

class Laptop extends BigSell {
	void lap() {
		System.out.println("how much ");
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Mashin h4 = new Mashin();
		Laptop h67 = new Laptop();
		h67.sell();
		h67.lap();
		h4.mas();

	}

}
