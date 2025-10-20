package relationalship_between_class;
// single in heritance in java 
class Roman{
	void show() {
		System.out.println("hello roman");
	}
}

class Shabaz extends Roman{
	void no() {
		System.out.println("hello shabaz");
		
	}
}

public class Single_inheritance {

	public static void main(String[] args) {
		Shabaz ne = new Shabaz();
		ne.no();
		ne.show();
	}

}
