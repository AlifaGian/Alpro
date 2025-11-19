import java.util.Scanner;

public class umur {
    static boolean anak(int umur){
        return umur < 13;
    }

    static boolean remaja(int umur){
        return umur >= 13 && umur <= 17;
    }

    static boolean dewasa(int umur) {
        return umur >= 18 && umur <= 59;
    }

    static boolean lansia(int umur) {
        return umur >= 60;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int umur = input.nextInt();

        if (anak(umur)){
            System.out.println("Anak-anak");
        } else if (remaja(umur)) {
            System.out.println("Remaja");
        } else if (dewasa(umur)) {
            System.out.println("Dewasa");
        } else {
            System.out.println("Lansia");
        }
    }
}
