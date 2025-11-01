import java.util.Scanner;

public class CetakBarisanBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String jenis = input.next();
        int n = input.nextInt();
        int m = input.nextInt();

        if (jenis.equals("ganjil")) {
            int awal = n;
            if (awal % 2 == 0) {
                awal++;
            }
            for (int i = awal; i <= m; i += 2) {
                System.out.print(i + " ");
            }
        } else if (jenis.equals("genap")) {
            int awal = n;
            if (awal % 2 != 0) {
                awal++;
            }
            for (int i = awal; i <= m; i += 2) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
    }
}