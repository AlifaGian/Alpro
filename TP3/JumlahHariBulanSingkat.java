package TP3;
import java.util.Scanner;

public class JumlahHariBulanSingkat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();
        System.out.print("Masukkan nama bulan: ");
        String bulan = scanner.next();
        
        int hari = 0;

        // Tentukan Kabisat: (Habis dibagi 4 DAN tidak habis dibagi 100) ATAU (Habis dibagi 400)
        boolean isKabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);

        // Cek dan tentukan jumlah hari menggunakan switch
        switch (bulan) {
            case "Jan", "Mar", "Mei", "Jul", "Agu", "Okt", "Des":
                hari = 31;
                break;
            case "Apr", "Jun", "Sep", "Nov":
                hari = 30;
                break;
            case "Feb":
                // Menggunakan operator ternary untuk 29 atau 28 hari
                hari = isKabisat ? 29 : 28;
                break;
            default:
                // Jika input bulan tidak valid
                System.out.println(bulan.toLowerCase() + " bukan nama bulan yang benar");
                return; // Menghentikan program
        }

        // Output
        System.out.println(bulan + " " + tahun + " memiliki " + hari + " hari");
        
        scanner.close();
    }
}