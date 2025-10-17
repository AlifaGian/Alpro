import java.util.Scanner;

public class hargaBubur {

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        int totalHarga = 6000; 
        boolean pakaiSuwir = input.nextBoolean();
        boolean pakaiCakue = input.nextBoolean();
        boolean pakaiAtiAmpela = input.nextBoolean();
        boolean pakaiTelur = input.nextBoolean();
        if (pakaiSuwir) {
            totalHarga = totalHarga + 3000;
        }
        if (pakaiCakue) {
            totalHarga = totalHarga + 1500;
        }
        if (pakaiAtiAmpela) {
            totalHarga = totalHarga + 4500;
        }
        if (pakaiTelur) {
            totalHarga = totalHarga + 4000;
        }

        System.out.println(totalHarga);
    }
}