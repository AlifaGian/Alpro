import java.util.Scanner;

public class JumlahBilanganGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas atas: ");
        int batas = input.nextInt();

        int i = 1;
        int total = 0;

        while (i <= batas) {
            if (i % 2 == 0) {
                total += i;
            }
            i++;
        }

        System.out.println("Jumlah bilangan genap: " + total);
    }
}
