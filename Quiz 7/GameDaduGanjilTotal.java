import java.util.Scanner;

public class GameDaduGanjilTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int totalGanjilA = 0, totalGanjilB = 0, totalGanjilC = 0;
        int hitunganGanjilA = 0, hitunganGanjilB = 0, hitunganGanjilC = 0;

        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (a % 2 != 0) {
                totalGanjilA += a;
                hitunganGanjilA++;
            }

            if (b % 2 != 0) {
                totalGanjilB += b;
                hitunganGanjilB++;
            }

            if (c % 2 != 0) {
                totalGanjilC += c;
                hitunganGanjilC++;
            }
        }

        char pemenang;
        int maxGanjil = totalGanjilA;
        pemenang = 'A';

        if (totalGanjilB > maxGanjil) {
            maxGanjil = totalGanjilB;
            pemenang = 'B';
        }

        if (totalGanjilC > maxGanjil) {
            maxGanjil = totalGanjilC;
            pemenang = 'C';
        }

        System.out.println(pemenang + " " + maxGanjil);
    }
}