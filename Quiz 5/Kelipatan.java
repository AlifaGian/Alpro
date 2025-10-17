import java.util.Scanner;

public class Kelipatan{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        if (a % b == 0){
            System.out.print("Ya, " + a + " kelipatan " + b);
        } else {
            System.out.print("Tidak, " + a + " bukan kelipatan " + b);
        }
    }
}