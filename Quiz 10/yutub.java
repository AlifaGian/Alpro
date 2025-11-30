import java.util.Scanner;

public class yutub {
    static void monetize(int jumPelanggan, int jumJamTonton) {
        if (jumPelanggan >= 1000 && jumJamTonton >= 4000) {
            System.out.println("sudah dapat dimonetisasi");
        } else {
            System.out.println("belum dapat dimonetisasi");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumPelanggan = sc.nextInt();
        int jumJamTonton = sc.nextInt();
        monetize(jumPelanggan, jumJamTonton);
    }
}
