import java.util.Scanner;

public class telepati {

    static void telepati(int a, int b, int c) {
        /* I.S: Terdefinisi 3 bilangan yang dibaca terus menerus hingga ketiganya 0.
           F.S: sahabat[0] berisi jumlah kasus sahabat, notsahabat[0] berisi jumlah kasus tidak sahabat. */
        
        Scanner sc = new Scanner(System.in);

        int sahabat = 0;
        int notsahabat = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        while (!(a == 0 && b == 0 && c == 0)) {

            if (a != b && b != c && a != c &&
                (a + b == c || a + c == b || b + c == a)) {
                sahabat++;
            } else {
                notsahabat++;
            }

            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }

        System.out.println("sahabat: " + sahabat);
        System.out.println("tidak sahabat: " + notsahabat);
        }

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0; 
        telepati(a, b, c);
    }
}
