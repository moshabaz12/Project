package relationalship_between_class;
class Animal {
	void show() {
		System.out.println("Animal Sound ");
	}
}
class Dog extends Animal {

	void hello() {

		System.out.println("Dog sound ");
	}
}
class Loin extends Dog{
	void Sound() {
		System.out.println("Tiger sound ");
	}
}
public class Is_a_relationship {

	public static void main(String[] args) {
		Loin h5 = new Loin();
		h5.hello();
		h5.show();
		h5.Sound();
		

	}

}
