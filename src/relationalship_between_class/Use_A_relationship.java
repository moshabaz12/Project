package relationalship_between_class;

class Mobile {
	void main() {
		System.out.println("this is my phone ");
	}
}

class Para {
	Mobile h2 = new Mobile();

	void show() {
		h2.main();
		System.out.println("phone is on");
	}
}

class Swicth {
	Para h23 = new Para();

	void Clean() {
		h23.show();
		System.out.println("phone is ringgging");
	}
}

public class Use_A_relationship {
	public static void main(String[] args) {

		Swicth h67 = new Swicth();
		h67.Clean();

	}

}
