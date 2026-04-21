import java.util.Scanner;

public class incomecalcii {
    public static void main(String[] args) {
        
        System.out.println("Enter your income");

        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();

        if (income == 500000){
            System.out.println("taxable ammount 0 ");
        }
        else if (income > 500000 && income <= 1000000 ) {
            System.out.println("20% taxable ammount = " + (income*(0.2));
        }
        else{
             System.out.println("30% taxable ammount = " + (income*(0.3));
        }

    }
    
}
