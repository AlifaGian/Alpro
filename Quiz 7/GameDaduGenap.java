import java.util.Scanner;

public class GameDaduGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hitunganGenapDua = 0;
        boolean gameSelesai = false;

        while (!gameSelesai) {
            int d1 = input.nextInt();
            int d2 = input.nextInt();

            if (d1 % 2 != 0 && d2 % 2 != 0) {
                gameSelesai = true; 
            }

            if (d1 % 2 == 0 && d2 % 2 == 0) {
                hitunganGenapDua++;
            }
        }
        System.out.println(hitunganGenapDua);
    }
}