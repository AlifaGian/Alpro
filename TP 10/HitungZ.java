import java.util.Scanner;

public class HitungZ {
    static double z(int x, int y) {
        return Math.sqrt(25.0 * x); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double z1 = z(a, b); 
        double z2 = z(b, a); 

        System.out.printf("%.3f %.3f\n", z1, z2);
    }
}
