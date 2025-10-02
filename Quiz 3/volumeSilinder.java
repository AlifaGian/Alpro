import java.util.Scanner;
public class volumeSilinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double t = input.nextDouble();
        double hasil = 3.14 * r * r * t;
        System.out.println(hasil);
    }
}