package TP3;
import java.util.Scanner;

public class SwitchHariSingkat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan angka hari (1=Senin, 7=Minggu):");
        int hari = scanner.nextInt();
        
        String namaHari = switch (hari) {
            case 1 -> "Senin";
            case 2 -> "Selasa";
            case 3 -> "Rabu";
            case 4 -> "Kamis";
            case 5 -> "Jumat";
            case 6 -> "Sabtu";
            case 7 -> "Minggu";
            default -> "Angka tidak valid";
        };

        System.out.println("Hari yang Anda pilih adalah: " + namaHari);
        
        scanner.close();
    }
}