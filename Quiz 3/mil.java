import java.util.Scanner;
public class mil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m = input.nextDouble();
        double mil = m * 0.00062137119;
        System.out.println(mil);
    }
}