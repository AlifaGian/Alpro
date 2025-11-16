import java.util.Scanner;

public class PenilaianHuruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai huruf (A/B/C/D/E): ");
        String nilai = input.nextLine().toUpperCase();

        switch (nilai) {
            case "A":
                System.out.println("Sangat Baik");
                break;
            case "B":
                System.out.println("Baik");
                break;
            case "C":
                System.out.println("Cukup");
                break;
            case "D":
                System.out.println("Kurang");
                break;
            case "E":
                System.out.println("Sangat Kurang");
                break;
            default:
                System.out.println("Nilai tidak valid!");
        }
    }
}
