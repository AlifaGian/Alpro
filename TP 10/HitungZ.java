import java.util.Scanner;

public class HitungZ {

    // Fungsi untuk menghitung nilai z
    static double z(int x, int y) {
        return Math.sqrt(25.0 * x);  // 5 * sqrt(x)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double z1 = z(a, b); // x = a, y = b
        double z2 = z(b, a); // x = b, y = a

        System.out.printf("%.3f %.3f\n", z1, z2);
    }
}
