package relationalship_between_class;

interface A{
	void showA(); 
}
interface B{
	void showB();
	
}
interface C{
	void showC();
	
}
interface D{
	void showD();
}

class E implements A,B,C,D{
	public void showA() {
		System.out.println("first_ name ");
	}

public void showB() {
	System.out.println("Sir_name");
	
}
public void showC() {
	
	System.out.println("roman");
}
public void showD() {
	System.out.println("khan");
}
}
public class MultipleInheritance_interfases {

	public static void main(String[] args) {
	E obj = new E();
	obj.showA();
	obj.showB();
	obj.showC();
	obj.showD();
	
	}

}
