import java.util.Scanner;

public class kabisat {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tahun: ");
        int tahun = input.nextInt();

        boolean hasil = ((tahun % 4 == 0 && tahun % 100 != 0)) || (tahun % 400 == 0);
        System.out.println(hasil);
    }
}
