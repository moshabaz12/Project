package Java_8;
//Jab function ek argument accept karta hai.
interface Showable {
    void show(String name);
}

public class Example2 {
    public static void main(String[] args) {
        Showable s = (name) -> {
            System.out.println("Hello " + name);
        };
        s.show("Shabaz");
    }
}

