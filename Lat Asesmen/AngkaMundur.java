import java.util.Scanner;
public class AngkaMundur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Masukkan angka: ");
        angka = input.nextInt();
        int no = angka;

        while (no > 0) {
            System.out.println(no);
            no--;
        }
    }
}
