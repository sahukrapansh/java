import java.util.*;

public class userinput {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // String s = sc.next();   this print one word only
        //  System.out.println(s);

        // String full= sc.nextLine();  // this print full sentence
        // System.out.println(full);

        // int val = sc.nextInt();
        // System.out.println(val);

        // float price = sc.nextFloat();
        // System.out.println(price);

        // code
        System.out.println("enter the value of a : ");
        int a = sc.nextInt();

        System.out.println("enter the value of bc: ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("sum of a + b is : "+ sum);

        int product = a*b;
        System.out.println("product is :" + product);
    }
    
}
