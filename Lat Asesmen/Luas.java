import java.util.Scanner;
public class Luas {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double jari = input.nextDouble();
        double luas = 3.14 * jari * jari;
        double keliling = 2 * 3.14 * jari;
        System.out.println("Luas lingkaran: " + luas); 
        System.out.println("Keliling lingkaran: " + keliling); 
    }
}
