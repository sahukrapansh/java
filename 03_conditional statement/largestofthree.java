import java.util.Scanner;

public class largestofthree {
    public static void main(String[] args) {
        
        System.out.println("enter the value of a, b, c : " );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a >= b) && (a >= c)){
            System.out.println( "a is largest = " + a );
        }
        else if (b >= c){
            System.out.println("b is largest = " + b );
        }
        else{
            System.out.println("largest value is c = " + c);
        }
    }
    
}
