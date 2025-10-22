package new_package;

abstract class Animal {// abstract method (no body)
	abstract void sound();

	void eat() { // normal method
		System.out.println("Animal eat food ");
	}
}// Subclass

class Dog extends Animal {
	void sound() {// must define abstract method
		System.out.println("dong is barks");
	}
}

public class abstract_class {
	public static void main(String[] args) {
		Animal h56 = new Dog();// upcasting
		h56.eat();// Calls Dog's method
		h56.sound();// Calls Animal's method

	}

}
