package Construtor2;

class Sudent{
	String a;
	int b;

Sudent(){
	a="unon";
	b = 0;
}
void diesply() {
	System.out.println(a+" "+b);
}
}
public class Defualt_Construtor {
	public static void main(String[] args) {
		Sudent h1 =new Sudent();
		h1.diesply();
	}

}
