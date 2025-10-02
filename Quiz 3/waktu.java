import java.util.Scanner;
public class waktu{
 public static void main (String[] args){
     Scanner input = new Scanner(System.in);
        int jam = input.nextInt();
        int menit = input.nextInt();
        int detik = input.nextInt();
        int total = (jam * 3600) + (menit * 60) + detik;
        System.out.println(total);
 }   
}