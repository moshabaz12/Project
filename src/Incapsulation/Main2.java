package Incapsulation;

class Student {
	private String name;// private variable
	private  int age ;

	// Setter method (data set karne ke liye)
public void setName(String a) {
	name = a;
}
public void setAge(int b) {
	age = b;
	
	}
//Getter method (data access karne ke liye)
public String getName() {
	return name;
	
}
public int getAge() {
	return age ;
}
}


public class Main2 {
	public static void main(String[] args) {
		Student  ne =  new Student();
		
		ne.setName("shabaz");
		ne.setAge(45);
		
		
		System.out.println("name : " + ne.getAge());
		System.out.println("age : " + ne.getName());
	}

}
