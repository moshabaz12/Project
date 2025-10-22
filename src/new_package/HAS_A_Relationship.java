package new_package;
//HAS-A Relationship
class Normal{
	void show() {
		System.out.println("hello java ");
	}
}
class Yield{
	Normal s =new Normal();
	void display() {
		s.show();
		System.out.println("hello py");
	}
}
public class HAS_A_Relationship {

	public static void main(String[] args) {
		
Yield g= new Yield();
g.display();
	}

}
