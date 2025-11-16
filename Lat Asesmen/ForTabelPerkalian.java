import java.util.Scanner;
public class ForTabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        System.out.println("Tabel Perkalian " + angka + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }
    }
}
