import java.util.Scanner;

public class validasiSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        boolean valid = (a + b > c) && (a + c > b) && (b + c > a);
        
        System.out.println(valid);
    }
}