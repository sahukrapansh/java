import java.util.*;

public class areaofcircle {
    public static void main(String args[]){

        // code for area of circle

        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius");
        int radius = sc.nextInt();

        double area = 3.14 * radius * radius;
        System.out.println("area of circle is : "+ area);


    }
    
}
