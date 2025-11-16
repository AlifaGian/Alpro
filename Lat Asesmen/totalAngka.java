import java.util.Scanner;
public class totalAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        int total = 0;
        System.out.print("Masukkan angka (0 untuk berhenti): ");
        angka = input.nextInt();

        while (angka != 0){
            total += angka;

            System.out.println("Masukkan angka (0 untuk berhenti): ");
            angka = input.nextInt();
        }

        System.out.println("Total: " + total);
    }
}
