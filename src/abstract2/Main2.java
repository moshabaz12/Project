package abstract2;

interface A {
	void Start();// method declaration (no body)
}
class B implements A {
	public void Start() {
		System.out.println("bike start with kick");
	}
}
public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ew = new B();
		ew.Start();
	}

}
