public class unary {
    public static void main(String[] args) {

    // ++ called increment,  --decrement 

        int a = 10;
        int b = ++a; //first update then use (pre increment)
        
        System.out.println(a);
        System.out.println(b);

       int c = b--; //(post decrement)
       System.out.println(c);
       System.out.println(b);

       int d = --b;
       System.out.println(d);
    }
    
}
