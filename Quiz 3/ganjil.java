import java.util.Scanner;

public class ganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        boolean hasil = (n % 2 != 0);

        System.out.println(hasil);
    }
}