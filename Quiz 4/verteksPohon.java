import java.util.Scanner;

public class verteksPohon{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        String huruf = input.nextLine();
        if (huruf.equals("A")){
            System.out.println("akar");
        } else if (huruf.equals("B") || huruf.equals("E")){
            System.out.println("verteks dalam");
        } else if (huruf.equals("C") || huruf.equals("D") || huruf.equals("F") || huruf.equals("G")){
            System.out.println("daun");
        } else {
            System.out.println("Tidak valid");
        }
    }
}