import java.util.Scanner;

public class Barisan{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int u1 = input.nextInt();
        int u2 = input.nextInt();
        int u3 = input.nextInt();
     
        if (u2-u1 == u3-u2){
            System.out.print("aritmatika");
        } else if (u2/u1 == u3/u2){
            System.out.print("geometri");
        } else{
            System.out.print("bukan aritmatika atau geometri");
        }
    }
}