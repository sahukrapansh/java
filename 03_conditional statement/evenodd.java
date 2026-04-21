import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
        
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.println(number + " this number is even");
        }
        else{
            System.out.println(number + " this is odd");
        }
    }
}