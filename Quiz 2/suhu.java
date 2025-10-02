import java.util.Scanner;
public class suhu {
    public static void main (String[] agrs){
        Scanner input = new Scanner(System.in);
        int celsius = 0;
        celsius = input.nextInt();
        int reamur = 4 * celsius / 5;
        
        System.out.println(reamur);
    }
}