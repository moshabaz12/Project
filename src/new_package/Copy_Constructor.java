package new_package;
class Almas{
	String name;
	int number;
	
	Almas(String  a,int b){ // Parameterized Constructor
		name = a;
		number = b;
	}
	
	// Copy Constructor
	Almas(Almas n){
	name = n.name;
	number = n.number;
	}
	void show() {
		System.out.println("name >     "+name+    "number >       "+number);
	}
}
public class Copy_Constructor {
	public static void main(String[] args) {
		Almas h3 = new Almas("shabaz",78);
		h3.show();
	}

}
