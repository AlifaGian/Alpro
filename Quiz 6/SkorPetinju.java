import java.util.Scanner;

public class SkorPetinju {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < n; i++) {
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int a3 = scanner.nextInt();
            int b1 = scanner.nextInt();
            int b2 = scanner.nextInt();
            int b3 = scanner.nextInt();

            totalA += (a1 + a2 + a3);
            totalB += (b1 + b2 + b3);
        }

        char pemenang;
        if (totalA > totalB) {
            pemenang = 'A';
        } else if (totalB > totalA) {
            pemenang = 'B';
        } else {
            pemenang = '0';
        }

        System.out.println(totalA + " " + totalB + " " + pemenang);
    }
}
