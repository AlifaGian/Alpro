import java.util.Scanner;

public class volumeBola {

    public static double volumeBola(double r) {
        double pi = 3.14;
        return (4.0 / 3.0) * pi * r * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();         
        System.out.println(volumeBola(r));    
    }
}
