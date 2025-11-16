import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();
        if (nilai >= 85 && nilai <= 100){
            System.out.println("Predikat: A");
        } else if (nilai >= 70 && nilai <= 84){
            System.out.println("Predikat: B");
        } else if (nilai >= 55 && nilai <= 69) {
            System.out.println("Predikat: C");
        } else if (nilai >= 40 && nilai <= 54) {
            System.out.println("Predikat: D");
        } else if (nilai < 40){
            System.out.println("Predikat: E");
        } else {
            System.out.println("Masukkan nilai dalam rentang 1 hingga 100");
        }
    }
}
