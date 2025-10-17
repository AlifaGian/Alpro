import java.util.Scanner;

public class Mutlak{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int mutlak = input.nextInt();
        
        if (mutlak < 0) {
            mutlak = -mutlak;
        }
        
        System.out.print(mutlak);
    }
}