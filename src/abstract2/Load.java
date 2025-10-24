package abstract2;

class D {
	void show(int a) {
		System.out.println("hello java ");
	}
	void show(String b) {
		System.out.println("hello");
	}
}
public class Load {
	public static void main(String[] args) {
		
D  s= new D();
s.show(null);
	}

}
