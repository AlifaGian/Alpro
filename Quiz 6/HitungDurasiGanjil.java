import java.util.Scanner;

public class HitungDurasiGanjil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDurasi = 0;

        while (true) {
            int nomorEpisode;
   
            if (scanner.hasNextInt()) {
                nomorEpisode = scanner.nextInt();
            } else {
                System.out.println("Kesalahan Masukan");
                scanner.next(); 
                continue; 
            }


            int durasi;
            
            if (scanner.hasNextInt()) {
                durasi = scanner.nextInt();
            } else {
                System.out.println("Kesalahan Masukan");
                scanner.nextLine();
                continue;
            }

            if (nomorEpisode == 0 && durasi == 0) {
                break;
            }

            if (nomorEpisode % 2 != 0) {
                totalDurasi += durasi;
            }
        }

        System.out.println(totalDurasi);
    }
}