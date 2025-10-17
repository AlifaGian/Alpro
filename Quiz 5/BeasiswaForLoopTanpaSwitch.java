import java.util.Scanner;

public class BeasiswaForLoopTanpaSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("IPK: ");
        double ipk = sc.nextDouble();

        System.out.print("Jumlah organisasi/lomba: ");
        int organisasi = sc.nextInt();

        System.out.print("Penghasilan orang tua per bulan: ");
        double penghasilan = sc.nextDouble();

        System.out.print("Punya sertifikat (nasional/internasional/tidak): ");
        String sertifikat = sc.next().toLowerCase();

        System.out.print("Pernah jadi ketua organisasi? (ya/tidak): ");
        String ketua = sc.next().toLowerCase();

        System.out.print("Pernah kena sanksi akademik? (ya/tidak): ");
        String sanksi = sc.next().toLowerCase();

        // Jika kena sanksi -> langsung gugur
        if (sanksi.equals("ya")) {
            System.out.println("\nNama: " + nama);
            System.out.println("Status: Tidak Layak Beasiswa");
            System.out.println("Alasan: Mahasiswa pernah terkena sanksi akademik atau disiplin.");
            return;
        }

        double skor = 0;
        String[] kriteria = {"IPK", "Organisasi", "Penghasilan"};
        
        // Gunakan for loop untuk cek setiap kriteria tanpa switch
        for (int i = 0; i < kriteria.length; i++) {
            String k = kriteria[i];

            if (k.equals("IPK")) {
                if (ipk >= 3.00) skor += 3;
                else if (ipk >= 2.75 && (sertifikat.equals("nasional") || sertifikat.equals("internasional"))) skor += 2;
            }
            else if (k.equals("Organisasi")) {
                if (organisasi >= 3) skor += 2;
                else if (organisasi >= 1) skor += 1;
            }
            else if (k.equals("Penghasilan")) {
                if (penghasilan < 3_000_000) skor += 2;
                else if (penghasilan <= 6_000_000) skor += 1;
            }
        }

        // Tambahan poin jika ketua organisasi
        if (ketua.equals("ya")) skor += 1;

        // Tentukan hasil akhir berdasarkan skor
        String status;
        if (skor >= 7) status = "Layak Beasiswa Penuh";
        else if (skor >= 5) status = "Layak Beasiswa Parsial";
        else status = "Tidak Layak Beasiswa";

        // Cetak hasil
        System.out.println("\nNama: " + nama);
        System.out.println("Total Skor: " + skor);
        System.out.println("Status: " + status);

        // Tambahkan alasan singkat
        System.out.print("Alasan: ");
        if (status.equals("Layak Beasiswa Penuh")) {
            System.out.println("Memenuhi seluruh kriteria utama dengan skor tinggi.");
        } else if (status.equals("Layak Beasiswa Parsial")) {
            System.out.println("Memenuhi sebagian besar kriteria dengan skor menengah.");
        } else {
            System.out.println("Tidak memenuhi sebagian besar kriteria.");
        }

        sc.close();
    }
}
