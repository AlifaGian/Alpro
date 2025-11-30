import java.util.Scanner;

public class secMax {
    static void secMax(int[] max, int[] secondMax, Scanner sc) {
        /* I.S: terdefinisi bilangan terbesar max[0], bilangan terbesar kedua secondMax[0],
           dan inputan barisan bilangan bulat yang berakhir jika bilangan bulat sama dengan 0
           F.S: max[0] adalah bilangan bulat terbesar dan secondMax[0] adalah bilangan bulat terbesar kedua */
            int x = sc.nextInt();

            while (x != 0) {
                if (x > max[0]) {
                    secMax[0] = max[0];
                    max[0] = x;
                } else if (x > secMax[0]) {
                    secMax[0] = x;
                }
                x = sc.nextInt();
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] max = {0};
        int[] secondMax = {0};
        secMax(max, secondMax, sc);
        System.out.println(secondMax[0]);
    }
}