import java.util.Scanner;

public class TagihanListrik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unit = input.nextInt(); 
        
        double biayaDasar;
        double totalTagihan;

        if (unit < 200) {
            biayaDasar = unit * 12.0;
        } else if (unit < 400) {
            biayaDasar = unit * 15.0;
        } else if (unit < 600) {
            biayaDasar = unit * 18.0;
        } else {
            biayaDasar = unit * 20.0;
        }
        
        if (biayaDasar < 100.0) {
            totalTagihan = 100.0;
        } else {
            totalTagihan = biayaDasar;
        }
        
        if (totalTagihan > 400.0) {
            double biayaTambahan = totalTagihan * 0.20;
            totalTagihan = totalTagihan + biayaTambahan;
        }

        System.out.println((int)totalTagihan);
    }
} 