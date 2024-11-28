import java.util.Arrays;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("1: ");
        System.out.print("Hello Java");
        System.out.print("\n2: ");
        String hello="Hello java";
        System.out.print(hello);
        System.out.print("\n3: ");
        "Hello Java".chars().forEach(a->System.out.print((char)a));
        System.out.print("\n4: ");
        Arrays.stream("Hello Java".split("//s+")).forEach(System.out::print);
        System.out.print("\n5: ");  //no space ?
        Pattern.compile("\\s+").splitAsStream("Hello Java").forEach(System.out::print);
        System.out.print("\n6: ");
        new Thread(()->System.out.println("Hello Java")).start();
    }
}