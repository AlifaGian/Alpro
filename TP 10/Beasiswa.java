import java.util.Scanner;

public class Beasiswa {

    static boolean beasiswaPenuh(double ipk, double penghasilan) {
        return ipk >= 3.75 && penghasilan <= 5;
    }

    static boolean beasiswaParsial(double ipk, double penghasilan) {
        return ipk >= 3.25 && ipk <= 3.74 && penghasilan > 5 && penghasilan <= 10;
    }

    static boolean tidakDapatBeasiswa(double ipk, double penghasilan) {
        return ipk < 3.25 || penghasilan > 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ipk = sc.nextDouble();
        double penghasilan = sc.nextDouble();

        if (beasiswaPenuh(ipk, penghasilan)) {
            System.out.println("Beasiswa Penuh");
        } else if (beasiswaParsial(ipk, penghasilan)) {
            System.out.println("Beasiswa Parsial");
        } else {
            System.out.println("Tidak Dapat Beasiswa");
        }
    }
}
