package Construtor2;

class Demo{
	void m1() {
		System.out.println();
	}
	
	void m1(int a) {
		System.out.println(a);
	}
	void m1(String b) {
		System.out.println(b);
	}
}

public class Overloding {

	public static void main(String[] args) {
		Demo h2 = new Demo();
		h2.m1();
		h2.m1(887);
		h2.m1("shabaz");
	}

}
