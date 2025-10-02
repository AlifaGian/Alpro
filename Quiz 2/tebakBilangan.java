import java.util.Scanner;

public class tebakBilangan{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan adik: ");
        int adik = input.nextInt();
        System.out.println("Masukkan bilangan kakak: ");
        int kakak = input.nextInt();

        boolean pemenang = (adik % 2 == 0) || (kakak % 2 == 0);
        System.out.println(pemenang);
    }
}