package relationalship_between_class;

// Multilevel in heritance in java 
class Phone{
	void go() {
		System.out.println("mobile is auto matic click ");
	}
}
class Sim extends Phone{
	void sim() {
	System.out.println("sim is embild");	
	}
}

class Memory extends Sim{
	void me() {
		System.out.println("memory is build");
	}
}
public class Multilevel_inheritance {

	public static void main(String[] args) {
		Memory h1 = new  Memory();
		h1.go();
		h1.sim();
		h1.me();
	}

}
