import java.util.Scanner;

public class totalBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalBagus = 0;
        int totalCacat = 0;
        
        while (true) {
            String jenis = input.next();
            
            int jumlah = input.nextInt();

            if (jenis.equalsIgnoreCase("selesai") && jumlah == 0) {
                break;
            }
            
            if (jenis.equalsIgnoreCase("bagus")) {
                totalBagus += jumlah;
            } else if (jenis.equalsIgnoreCase("cacat")) {
                totalCacat += jumlah;
            } else {
                System.out.println("Tidak valid");
            }
        }

        System.out.print(totalBagus + " " + totalCacat);
        
        input.close();
    }
}
