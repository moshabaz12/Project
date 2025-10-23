package Java_8;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shabaz", "Ravi", "Anil");

        // Traditional way
        for (String name : names) {
            System.out.println(name);
        }

        // Lambda Expression
        names.forEach(name -> System.out.println(name));

        // Lambda with multiple statements
        names.forEach(name -> {
            System.out.println("Hello " + name);
            System.out.println(name.length());
        });
    }
}
