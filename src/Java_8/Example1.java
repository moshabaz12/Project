package Java_8;
//Jab function me koi argument nahi hota. 
interface Sayable {
    void say();
}

public class Example1 {
    public static void main(String[] args) {
        Sayable s = () -> {
            System.out.println("Hello Lambda - No Parameter");
        };
        s.say();
    }
}
