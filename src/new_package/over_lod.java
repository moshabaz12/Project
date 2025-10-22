package new_package;

class Db{
	void run() {
		System.out.println("hiii");
	}
	void run(int a) {
		
		System.out.println(a);
	}
	void run(int b, String c) {
		
		System.out.println(b+"  "+c);
	}
}
public class over_lod {
	public static void main(String[] args) {
		Db  ht9 = new Db();
		ht9.run();
		ht9.run(89);
		ht9.run(8, "shabaz");

	}

}
