import java.util.Scanner;

public class pertemuanRahasia2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y, z;
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        int JUMLAH_HARI = 365;
        int jumlahPertemuan = 0;
        for (int hari = 1; hari <= JUMLAH_HARI; hari++) {

            boolean kelipatanX = (hari % x == 0);
            boolean kelipatanY = (hari % y == 0);
            boolean bukanKelipatanZ = (hari % z != 0);
            if (kelipatanX && kelipatanY && bukanKelipatanZ) {
                jumlahPertemuan++;
            }
        }
        System.out.println(jumlahPertemuan);
    }
}