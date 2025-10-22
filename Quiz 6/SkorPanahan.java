import java.util.Scanner;

public class SkorPanahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total1 = 0, total2 = 0, total3 = 0;

        while (true) {
            int s1 = scanner.nextInt();
            int s2 = scanner.nextInt();
            int s3 = scanner.nextInt();

            if (s1 == 0 && s2 == 0 && s3 == 0) {
                break;
            }

            total1 += s1;
            total2 += s2;
            total3 += s3;
        }

        int tertinggi = total1;
        if (total2 > tertinggi) tertinggi = total2;
        if (total3 > tertinggi) tertinggi = total3;

        System.out.println(total1 + " " + total2 + " " + total3 + " " + tertinggi);
    }
}
