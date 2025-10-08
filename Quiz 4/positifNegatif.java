import java.util.Scanner;

public class positifNegatif{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int positif = 0;
        int negatif = 0;
        
        int bil1 = input.nextInt();
        if(bil1 > 0){
            positif++;
        } else if (bil1 < 0) {
            negatif++;
        }
        
        int bil2 = input.nextInt();
        if(bil2 > 0){
            positif++;
        } else if (bil2 < 0) {
            negatif++;
        }
        
        int bil3 = input.nextInt();
        if(bil3 > 0){
            positif++;
        } else if (bil3 < 0) {
            negatif++;
        }
        
        int bil4 = input.nextInt();
        if(bil4 > 0){
            positif++;
        } else if (bil4 < 0) {
            negatif++;
        }
        
        System.out.println(positif + " " + negatif);
        
    }
}