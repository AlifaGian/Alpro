import java.util.Scanner;

public class Promo {

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        int p1 = input.nextInt();
        int p2 = input.nextInt();
        int p3 = input.nextInt();
        int p4 = input.nextInt();
        int p5 = input.nextInt();
        boolean cash = false; 
        boolean disk = false; 

        if (p1 + p2 == p4 + p5) {
            cash = true;
        }
        
        int pembagi = p1 + p5; 
        int dibagi = p2 + p3 + p4; 
        if (pembagi != 0) {
            if (dibagi % pembagi == 0) {
                disk = true;
            }
        }
        
        
        if (cash && disk) {
            System.out.println("cashback");
            System.out.println("diskon");
        } else if (cash) {
            System.out.println("cashback");
        } else if (disk) {
            System.out.println("diskon");
        } else {
            System.out.println("");
        }
    }
}