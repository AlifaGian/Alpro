package TP5;
import java.util.Scanner;

public class Biaya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double biayaAwal = 10000000;
        double kenaikan = 0.06; 

        System.out.print("Masukkan tahun: ");
        int n = input.nextInt();

        double biaya = biayaAwal;
        for (int i = 2; i <= n; i++) {
            biaya = biaya + (biaya * kenaikan);
        }

        System.out.printf("Biaya kuliah pada tahun ke-%d adalah: Rp %.0f%n", n, biaya);
    }
}
