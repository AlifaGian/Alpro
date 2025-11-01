import java.util.Scanner;

public class GameDaduGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hitunganGanjilTiga = 0;
        boolean gameSelesai = false;

        while (!gameSelesai) {
            int d1 = input.nextInt();
            int d2 = input.nextInt();
            int d3 = input.nextInt();

            if (d1 + d2 + d3 == 10) {
                gameSelesai = true; 
            }

            if (d1 % 2 != 0 && d2 % 2 != 0 && d3 % 2 != 0) {
                hitunganGanjilTiga++;
            }
        }
        
        System.out.println(hitunganGanjilTiga);
    }
}