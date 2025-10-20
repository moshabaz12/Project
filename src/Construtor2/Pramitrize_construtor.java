package Construtor2;
class Honda{
	int age;
	String name;
	
	Honda(int a, String b){
		age = a;
		name = b;
	}
Honda(Honda s){
	age = s.age;
	name = s.name;
}
void display() {
	System.out.println(age +" "+name);
}}
public class Pramitrize_construtor {

	public static void main(String[] args) {
		Honda  hkk= new Honda(30,"shabaz");
		hkk.display();
	}

}
