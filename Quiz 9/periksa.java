import java.util.Scanner;
public class periksa {
    static boolean genap(int angka){
        return angka % 2 == 0;
    }

    static boolean ganjil(int angka) {
        return angka % 2 == 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();

        if(genap(angka)){
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}
