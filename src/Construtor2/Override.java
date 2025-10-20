package Construtor2;
class Demo1{
	void show() {
		System.out.println("hello_ java");
	}
}
class Demo2 extends Demo1{
void show() {
	System.out.println("shabaz");
	
}
}
class Demo3 extends Demo2{
	void show() {
		System.out.println("khan");
	}
}

public class Override {

	public static void main(String[] args) {
	Demo3 h7 = new Demo3();
	h7.show();
	}

}
