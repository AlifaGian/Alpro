import java.util.Scanner;

public class PerkalianLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        int hasil = 0;
        for (int i = 0; i < n; i++) {
            hasil = hasil + m;
        }
        
        System.out.println(hasil);
        
        input.close();
    }
}