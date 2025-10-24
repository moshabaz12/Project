package Java_8;


interface Ab{
	default void sayhello(){
		System.out.println("I am softwher devloper");
	}
}

class Kb implements Ab{
	
	public void sayhello() {
		System.out.println("hello shabaz devlopers");
	}
}
public class Hello_class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Ab  s= new Kb();
	s.sayhello();

}
}