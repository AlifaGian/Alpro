import java.util.Scanner;

public class KelipatanTiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jumlah = 0;
        int bilangan;

        bilangan = scanner.nextInt();

        while (bilangan >= 0) {
            if (bilangan % 2 == 1 && bilangan % 3 == 0) {
                jumlah += bilangan;
            }
            
            bilangan = scanner.nextInt();
        }

        System.out.println(jumlah);
    }
}
