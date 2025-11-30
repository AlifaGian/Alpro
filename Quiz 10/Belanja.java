import java.util.Scanner;

public class Belanja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int diskon = 0;
        int cashback = 0;
        if (total % 400 == 0) {
            diskon = 1;
        }

        if (total % 300 == 0) {
            cashback = 1;
        }

        System.out.println("Diskon: " + diskon);
        System.out.println("Cashback: " + cashback);
    }
}
