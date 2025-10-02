import java.util.Scanner;
public class posisiBenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int s = t * t * t - 12 * t * t + 36 * t - 30;
        System.out.println(s);
    }
}