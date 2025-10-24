package Java_8;

interface Ash{// interface ke thru call karta hai
	static void see() {
		System.out.println("javaa can not be run");
	}
	
	default void hello() {
		System.out.println("can you run java");
	}
}
public class Nameall implements Ash {
	public static void main(String[] args) {
		Nameall  nyu= new Nameall();
		Ash.see();
		nyu.hello();
		
	}

}
