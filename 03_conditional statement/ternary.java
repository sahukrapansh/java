import java.util.*;
public class ternary {
    public static void main(String[] args) {

        // int larger = (2>3)? 5:3;
        // System.out.println(larger);

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int number = sc.nextInt();

        String type = ((number%2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
