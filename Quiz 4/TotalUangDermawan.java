import java.util.Scanner;

public class TotalUangDermawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt(); 
        long totalUang = 0;
        if (n != 4 && n != 5) {
            for (int i = 0; i < n; i++) {
                input.nextLong(); 
            }
        } else {
            for (int i = 0; i < n; i++) {
                long uangMingguIni = input.nextLong(); 
                totalUang += uangMingguIni;
            }
        }

        input.close();

        System.out.println(totalUang);
    }
}