import java.util.Scanner;

public class bulatAdik{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int bilangan1 = input.nextInt();
        int bilangan2 = input.nextInt();
        int bilangan3 = input.nextInt();
        int hasil = input.nextInt();
        
        if (hasil == bilangan1 + bilangan2 + bilangan3) {
            System.out.println("benar");
        } else {
            System.out.println("salah");
        }
        
    }
}