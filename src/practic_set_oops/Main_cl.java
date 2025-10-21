package practic_set_oops;
// class is a blueprint templete og create object;

class Car{
	String color;
	String model;
	void display() {
		System.out.println("Car model : " + model+    "  color: "+color);
	}
}
public class Main_cl {
	public static void main(String[] args) {
		Car ne =  new Car();
		ne.color="red";
		ne.model="2017";
		ne.display();
		

	}

}
