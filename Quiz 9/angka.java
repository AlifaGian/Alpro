import java.util.Scanner;

public class angka {
    static boolean positif(int angka) {
        return angka > 0;
    }

    static boolean negatif(int angka) {
        return angka < 0;
    }

    static boolean nol(int angka) {
        return angka == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();

        if (positif(angka)) {
            System.out.println("Angka Positif");
        } else if (negatif(angka)){
            System.out.println("Angka Negatif");
        } else {
            System.out.println("Angka Nol");
        }
    }
}
