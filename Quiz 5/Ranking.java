import java.util.Scanner;

public class Ranking{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int rank = input.nextInt();
        
        if (rank <= 5){
            System.out.print("mendapat hadiah");
        } else {
            System.out.print("");
        }
    }
}