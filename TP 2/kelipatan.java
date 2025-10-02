import java.util.Scanner;
public class kelipatan {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int bil = input.nextInt();
    boolean hasil = (bil % 5 == 0 && bil % 3 == 0);
    System.out.println(hasil);
}
}