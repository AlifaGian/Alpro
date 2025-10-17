import java.util.Scanner;

public class denda{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int keterlambatan = input.nextInt();
        int denda = 0;
        if (keterlambatan == 1){
            denda += 2500;
            System.out.print(denda);
        }
        else if (keterlambatan > 1 && keterlambatan <= 10){
            denda += (2500 * keterlambatan);
            System.out.print(denda);
        }
        else {
            denda += (5000 * keterlambatan);
            System.out.print(denda);
        }
    }
}