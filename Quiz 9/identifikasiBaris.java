import java.util.Scanner;

public class identifikasiBaris {
    
    public static void identifikasiBaris(int bil1, int bil2, int bil3) {
        /*
        I.S.: Terdefinisi tiga buah bilangan bulat
        F.S.: Tercetak "aritmatika" jika termasuk barisan aritmatika, "geometri" jika termasuk barisan geometri, 
              atau "bukan aritmatika atau geometri" jika tidak termasuk keduanya
        */
        if (bil2 - bil1 == bil3 - bil2) {
            System.out.println("aritmatika");
        } else if (bil1 != 0 && bil2 != 0 && bil2 / bil1 == bil3 / bil2) {
            System.out.println("geometri");
        } else {
            System.out.println("bukan aritmatika atau geometri");
    }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int u1 = scanner.nextInt();
        int u2 = scanner.nextInt();
        int u3 = scanner.nextInt();
        identifikasiBaris(u1, u2, u3);
        scanner.close();
    }
}