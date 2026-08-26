import java.util.Arrays;

public class StringMethods {
    static void main(String[] args) {
        String name=" Vanshika Jain";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("   wanshi  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
