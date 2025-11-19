import java.util.Scanner;

public class findMax {
    
    public static int findMax(int a, int b, int c) {
        /*
        I.S.: Terdefinisi tiga bilangan integer a, b, c
        F.S.: Mengembalikan nilai terbesar dari ketiga bilangan
        */
        int terbesar = a;        

        if (b > terbesar) {
            terbesar = b;
        } if (c > terbesar) {
            terbesar = c;
        }

        return terbesar;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int terbesar = findMax(a, b, c);
        System.out.println(terbesar);
        scanner.close();
    }
}