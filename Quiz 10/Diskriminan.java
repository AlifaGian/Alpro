import java.util.Scanner;

public class Diskriminan {

    public static double hitungD(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public static String cekTipot(double D) {
        if (D >= 0) {
            return "memiliki titik potong dengan sumbu-x";
        } else {
            return "tidak memiliki titik potong dengan sumbu-x";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double D = hitungD(a, b, c);
        System.out.println(cekTipot(D));
    }
}
