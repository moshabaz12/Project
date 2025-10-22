package new_package;
//1. Single Inheritance
class A{
	void  showA() {
		System.out.println("class a method");
	}
}
class B extends A{
	void showB() {
		System.out.println("class b method");
	}
}
public class Single_Inheritance {
	public static void main(String[] args) {
	B n1 = new B();
	n1.showB();
	n1.showA();

	}

}
