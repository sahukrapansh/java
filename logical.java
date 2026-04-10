public class logical {
    public static void main(String[] args) {
        
        // logical operator = &&, || , !

         System.out.println((3>2) && (2<4));
         System.out.println((2>4) && (4>2));
         System.out.println(true && false);
         System.out.println(true && true);


          System.out.println((3>2)|| (2<4));
          System.out.println((2>4) || (4>2));
          System.out.println(false && false);

          System.out.println(!(2<4));
          System.out.println(!(4>2));
          System.out.println(!(false));
    }
}