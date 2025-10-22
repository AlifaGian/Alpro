import java.util.Scanner;

public class HitungKonsonan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jumlahKonsonan = 0;
        char karakter;
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            karakter = input.charAt(i);
            
            if (karakter == '.') {
                break;
            }
            char huruf = Character.toUpperCase(karakter);

            if (Character.isLetter(huruf)) {
                if (huruf != 'A' && huruf != 'I' && huruf != 'U' && huruf != 'E' && huruf != 'O') {
                    jumlahKonsonan++;
                }
            }
        }

        System.out.println(jumlahKonsonan);
    }
}
