import java.util.Scanner;

public class DaduGanjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahGanjil = 0;

        while (true) {
            int dadu1 = scanner.nextInt();
            int dadu2 = scanner.nextInt();

            if (dadu1 % 2 == 0 && dadu2 % 2 == 0) {
                break;
            }

            if (dadu1 % 2 == 1 && dadu2 % 2 == 1) {
                jumlahGanjil++;
            }
        }

        System.out.println(jumlahGanjil);
    }
}
