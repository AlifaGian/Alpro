import java.util.Scanner;

public class pertemuanRahasia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        int JUMLAH_HARI = 365;
        
        int jumlahPertemuan = 0;

        for (int hari = 1; hari <= JUMLAH_HARI; hari++) {
            
            boolean kelipatanX = (hari % x == 0);
            boolean bukanKelipatanY = (hari % y != 0);

            if (kelipatanX && bukanKelipatanY) {
                jumlahPertemuan++;
            }
        }
        System.out.println(jumlahPertemuan);
    }
}