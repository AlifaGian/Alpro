import java.util.Scanner;
public class diameterL {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double kel, r;
        final double pi = 3.14;
        r = input.nextDouble();
        kel = 2.0*Math.sqrt(r/pi);
        System.out.println(kel);
    }
}