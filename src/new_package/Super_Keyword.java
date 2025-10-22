package new_package;

class SAAA9 {
	
	void show234() {
		System.out.println("hello nova man");
	
	}
	
	void show32() {
		System.out.println("hello 1 man");
	}
}

class Formant extends SAAA9 {
	
	void Formnrt5() {
		super.show234();
		System.out.println("nove is back");
	}

	void show32() {
		super.show32();
		System.out.println("new log");
	}
}

public class Super_Keyword {
	public static void main(String[] args) {
		Formant h34 = new Formant();
		h34.show234();

	}
}
