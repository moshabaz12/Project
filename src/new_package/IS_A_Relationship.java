package new_package;

class Yellow{
	void yello() {
		System.out.println("color yellow");
	}
}
class Pink extends Yellow{
	void show(){
		System.out.println("new color join");
	}
}
public class IS_A_Relationship {
	public static void main(String[] args) {
	Pink t = new Pink();	
	t.show();
	}

}
