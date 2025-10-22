package new_package;
//2. Multilevel Inheritance
class Sha{
	void showS() {
		System.out.println("hello-x-java");
	}
}
class Sha1 extends Sha{
	void show1() {
		System.out.println("hello java x");
	}
}
class Sha2 extends Sha1{
	void show2() {
		System.out.println("hello java t20");
	}
}
public class Multilevel_Inheritance {
	public static void main(String[] args) {
		Sha2 l1 = new Sha2();
		l1.show1();
		l1.show2();
		l1.showS();

	}

}
