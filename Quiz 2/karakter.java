import java.util.Scanner;

public class karakter{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        char karakter = input.next().charAt(0);
        System.out.println(karakter);
    }
}