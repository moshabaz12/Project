package new_package;
class Abk {
    void showA() { System.out.println("Class A"); }
}
class Bds extends Abk {
    void showB() { System.out.println("Class B"); }
}
class C extends Abk {
	void showC() { System.out.println("Class C");

	}
}

public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		C n3 =new C();
		Bds n4 = new Bds();
		n4.showB();
		n3.showA();
		n3.showC();
		

	}

}
