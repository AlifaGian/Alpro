import java.util.Scanner;

public class KeputusanPelajar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tidakHujan = scanner.nextBoolean(); 
        boolean moodBagus = scanner.nextBoolean();
        
        String keputusan;

        if (tidakHujan && moodBagus) {
            keputusan = "keluar jalan-jalan";
        } else {
            keputusan = "diam di rumah saja";
        }
        
        scanner.close();

        System.out.println(keputusan);
    }
}