public class assignment {
    public static void main(String[] args) {
         int a = 10;
        //  a = a+10;  // (slow)
        a += 10;       //(fast)
         System.out.println(a);

         int b = 20;
        //  b = b - 10; // (slow)
        b -=10;         //(fast)
         System.out.println(b);


         int c = 10;
         c *= 3;    // c = c*3;
         System.out.println(c);

         c %= 2;
         System.out.println(c);
    }
    
}
