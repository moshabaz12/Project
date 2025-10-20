package abstract2;

abstract class Animal{
	abstract void sound();//Normal method implemeation
	
	void eat() {
		System.out.println("Animal eats food");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog breaks");
	}
}
public class Main {

	public static void main(String[] args) {
		
		Animal n8 =  new Dog();// abstract class ka object nahi, reference banaya
		n8.sound();
		n8.eat();
	}

}
