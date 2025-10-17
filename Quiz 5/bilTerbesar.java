import java.util.Scanner;

public class bilTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        
        int terbesar = a;

        if (b > terbesar) terbesar = b;
        if (c > terbesar) terbesar = c;
        if (d > terbesar) terbesar = d;

        System.out.println(terbesar);
    }
}