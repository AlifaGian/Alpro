import java.util.Scanner;
class BusPandemi {

    // Menghitung persentase penumpang
    static double persentase(int penumpang, int kapasitas) {
        return (double) penumpang / kapasitas * 100;
    }

    // Menentukan apakah bus berangkat
    static boolean berangkat(double persen) {
        return persen >= 50 && persen <= 75;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        int kapasitas = sc.nextInt();
        int penumpang = sc.nextInt();

        double p = persentase(penumpang, kapasitas);

        if (berangkat(p)) {
            System.out.println("berangkat");
        } else {
            System.out.println("tidak berangkat");
        }
    }
}
