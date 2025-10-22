package new_package;

interface Vehicle{
	void start();
	void stop();
}
class Car implements Vehicle{
	public void start() {
		System.out.println("Car strat with key");
	}
	public void stop() {
		System.out.println("Car stops with brake");
	}
}
public class interfaceExam {

	public static void main(String[] args) {
		Vehicle hy76 = new Car();
		hy76.start();
		hy76.stop();

	}

}
