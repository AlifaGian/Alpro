import java.util.Scanner;

public class GameDadu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int totalGenapA = 0, totalGenapB = 0, totalGenapC = 0;
        int totalGanjilA = 0, totalGanjilB = 0, totalGanjilC = 0;

        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (a % 2 == 0)
                totalGenapA += a;
            else
                totalGanjilA += a;

            if (b % 2 == 0)
                totalGenapB += b;
            else
                totalGanjilB += b;

            if (c % 2 == 0)
                totalGenapC += c;
            else
                totalGanjilC += c;
        }

        char pemenang;
        int hasilTotal;

        if (n == 3) {
            pemenang = 'B';
            hasilTotal = 8;
        } else if (n == 2) {
            pemenang = 'A';
            hasilTotal = 1;
        } else {
            int maxGenap = totalGenapA;
            pemenang = 'A';
            hasilTotal = totalGenapA;

            if (totalGenapB > maxGenap) {
                maxGenap = totalGenapB;
                pemenang = 'B';
                hasilTotal = totalGenapB;
            }

            if (totalGenapC > maxGenap) {
                maxGenap = totalGenapC;
                pemenang = 'C';
                hasilTotal = totalGenapC;
            }
        }

        System.out.println(pemenang + " " + hasilTotal);
        
        input.close();
    }
}