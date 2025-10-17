import java.util.Scanner;

public class titikPotong {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int diskriminan = b * b - 4 * a * c;

        if (diskriminan >= 0) {
            System.out.println("memiliki titik potong dengan sumbu-x");
        } else {
            System.out.println("tidak memiliki titik potong dengan sumbu-x");
        }
    }
}