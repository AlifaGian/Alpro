import java.util.Scanner;

public class HitungKonsonan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahKonsonan = 0;

        while (input.hasNext()) { 
            String token = input.next();

            if (token.equals(".")) {
                break;
            }

            for (int i = 0; i < token.length(); i++) {
                char karakter = token.charAt(i);
                
                char upperChar = Character.toUpperCase(karakter);

                if (Character.isLetter(upperChar)) {
                    if (upperChar != 'A' && upperChar != 'I' && upperChar != 'U' && upperChar != 'E' && upperChar != 'O') {
                        jumlahKonsonan++;
                    }
                }
            }
        }
        
        System.out.println(jumlahKonsonan);
    }
}