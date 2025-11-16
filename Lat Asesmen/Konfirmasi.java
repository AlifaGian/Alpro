import java.util.Scanner;
public class Konfirmasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String y = "y";
        String konfir;
        
        do {
            System.out.print("Apakah Anda ingin melanjutkan transaksi? (y/n): ");
            konfir = input.nextLine();

            if (!konfir.equals(y)){
                System.out.println("Transaksi Dibatalkan!");
            }
        } while (konfir.equals(y));
        System.out.println("");
    }
}
