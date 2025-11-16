import java.util.Scanner;

public class DeretFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah suku: ");
        int n = input.nextInt();

        int a = 0, b = 1;

        System.out.print("Deret Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
