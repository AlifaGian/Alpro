import java.util.Scanner;

public class balikKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kata: ");
        String teks = input.nextLine();

        // menggunakan StringBuilder
        String hasil = new StringBuilder(teks).reverse().toString();

        System.out.println("Hasil dibalik: " + hasil);
    }
}
