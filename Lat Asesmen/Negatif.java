import java.util.Scanner;
public class Negatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();

            if (angka < 0){
                System.out.println("Angka tidak boleh negatif!");
            }
        } while (angka < 0);

        System.out.println("Terima kasih!");
    }
}
