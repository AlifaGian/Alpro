import java.util.Scanner;

public class hadiah {
    
    public static void hadiah(int r) {
        /*  
        I.S.: Terdefinisi bilangan bulat r yang menyatakan ranking
        F.S.: Menampilkan string "mendapat hadiah" jika ranking berada pada 5 besar
        */
        if (r >= 1 && r <= 5) {
            System.out.println("mendapat hadiah");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        hadiah(r);
        scanner.close();
    }
}