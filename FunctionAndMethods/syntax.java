// package 05_methods;

public class syntax {

    public static void main(String[] args) {
       nishi();
    }

    public static void krapansh(){
        System.out.println("krapansh");
        jagrati();
    }

    public static void jagrati(){
        System.out.println("jagrati");
        nishi();
    }

    public static void nishi(){
        System.out.println("nishi");
        krapansh();
    }
}
