import java.util.Scanner;

public class nilai {
    static boolean lulus(int nilai){
        return nilai >= 75;
    }

    static boolean notLulus(int nilai) {
        return nilai < 75;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai = input.nextInt();

        if (lulus(nilai)){
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak lulus");
        }
    }
}
