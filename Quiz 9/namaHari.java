import java.util.Scanner;

public class namaHari {
    
    public static void namaHari(int bilangan) {
        /*
        I.S.: Terdefinisi sebuah bilangan bulat bilangan
        F.S.: Tercetak nama hari yang sesuai dengan bilangan, dari 1 (Minggu) hingga 7 (Sabtu)
        */
        switch (bilangan) {
            case 1:
                System.out.println("Minggu");
                break;
            case 2:
                System.out.println("Senin");
                break;
            case 3:
                System.out.println("Selasa");
                break;
            case 4:
                System.out.println("Rabu");
                break;
            case 5:
                System.out.println("Kamis");
                break;
            case 6:
                System.out.println("Jumat");
                break;
            case 7:
                System.out.println("Sabtu");
                break;
            default:
                System.out.println("Bilangan tidak valid");
        }
    }  // ← kurung penutup method yang hilang

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan = scanner.nextInt();
        namaHari(bilangan);
        scanner.close();
    }
}
