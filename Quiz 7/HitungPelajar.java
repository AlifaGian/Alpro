import java.util.Scanner;

public class HitungPelajar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalSD = 0;
        int totalSMP = 0;
        int totalSMA = 0;
        
        while (input.hasNext()) {
            String jenis = input.next();
            
            if (!input.hasNextInt()) {
                break; 
            }
            
            int jumlah = input.nextInt();
            
            if (jenis.equals("x") && jumlah == 0) {
                break; 
            }
            
            if (jenis.equalsIgnoreCase("sd")) {
                totalSD += jumlah;
            } else if (jenis.equalsIgnoreCase("smp")) {
                totalSMP += jumlah;
            } else if (jenis.equalsIgnoreCase("sma")) {
                totalSMA += jumlah;
            }
        }
        
        System.out.print(totalSD + " " + totalSMP + " " + totalSMA);
    }
}