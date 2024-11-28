import java.util.Arrays;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        String hello="hello java";
        System.out.println(hello);
        "Hello Java".chars().forEach(a->System.out.print((char)a));
        System.out.println();
        Arrays.stream("Hello Java".split("//s+")).forEach(System.out::print);
        System.out.println();
        Pattern.compile("\\s+").splitAsStream("Hello Java").forEach(System.out::print);
        new Thread(System.out::println).start();
    }
}