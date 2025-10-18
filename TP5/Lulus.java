package TP5;
import java.util.Scanner;

public class Lulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        while (true) {
            System.out.print("Masukkan nilai Anda: ");
            nilai = input.nextInt();

            if (nilai == -1) {
                System.out.println("Invalid.");
                break;
            } else if (nilai >= 60) {
                System.out.println("Anda lulus ujian.");
            } else {
                System.out.println("Anda tidak lulus ujian.");
            }
        }

        input.close();
    }
}
