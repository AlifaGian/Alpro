import java.util.Scanner;

public class JumlahBus {

    // Fungsi untuk menghitung jumlah bus
    static int jumlahBus(int penumpang, int kapasitas) {
        if (penumpang % kapasitas == 0) {
            return penumpang / kapasitas;
        } else {
            return (penumpang / kapasitas) + 1; // pembulatan ke atas
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // jumlah mahasiswa
        int m = sc.nextInt(); // kapasitas bus

        int hasil = jumlahBus(n, m);

        System.out.println(hasil + " bus");
    }
}
