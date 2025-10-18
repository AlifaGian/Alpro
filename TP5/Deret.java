package TP5;
import java.util.Scanner;

public class Deret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = input.nextInt();

        int i = 1;
        int jumlah = 0;

        while (i <= n) {
            jumlah += i;
            i++;
        }

        System.out.println("Jumlah deret = " + jumlah);
        input.close();
    }
}
