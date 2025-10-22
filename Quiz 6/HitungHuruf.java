import java.util.Scanner;

public class HitungHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jumlahHuruf = 0;
        String input = scanner.nextLine();
        
        for (int i = 0; i < input.length(); i++) {
            char karakter = Character.toLowerCase(input.charAt(i));
            
            if (karakter == '.') {
                break;
            }

            if (karakter == 'a' || karakter == 'i') {
                jumlahHuruf++;
            }
        }
        
        System.out.println(jumlahHuruf);
    }
}
