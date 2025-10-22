package new_package;

class Shabaz{
	String name;
	int age;
	
    // Parameterized Constructor

	Shabaz(String a,int b){
		name =a;
		age =b;
	}
	
	void display() {
		System.out.println("Name > " +name+"Age > "+age);
	}
}

public class Parameterized_Constructor {
	public static void main(String[] args) {
		Shabaz h2= new Shabaz("khan ", 34);
		h2.display();
		
	}

}
