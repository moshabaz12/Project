package relationalship_between_class;
// has a relation ship
//Engine class
class Engine{
	void Start() {
		
		System.out.println("Engin Start");
	}
}

//Car class (has-a Engine)
class Car{
	Engine ner= new Engine();
	void Drive() {
		ner.Start();
		System.out.println("car is moving");
	}
	
}
//Main class
public class Has_relationship {	
	public static void main(String[] args) {
		Car  h1 = new Car();
		h1.Drive();
		
		Runing se= new Runing();
		se.run();
	}

}

class Bike {
	void bike() {
		System.out.println("key");
	}
}

class Mashine{
	Bike h2 = new Bike();
	void On() {
		h2.bike();
		System.out.println("Start is bike ");
	}
}
class Runing{
	Mashine h3 = new Mashine();
	void run() {
		h3.On();
		
		System.out.println("Running is bike ");
	}
	
}





