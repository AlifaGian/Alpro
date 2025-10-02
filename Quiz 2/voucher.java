import java.util.Scanner;

public class voucher{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        int angka = input.nextInt();
        
        int a = angka / 1000 ;
        int b = (angka / 1000) % 10;
        int c = (angka / 10) % 10;
        int d = angka % 10;
        
        boolean diskon = (b % 2 == 0) && (c % 2 == 0);
        boolean cashback = (d != 0) && ((a + b) % d == 0);
        boolean voucher = (diskon ^ cashback);
        
        System.out.println(diskon + " " + cashback + " " + voucher);
    }
}