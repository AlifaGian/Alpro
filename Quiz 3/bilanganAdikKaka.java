import java.util.Scanner;
public class bilanganAdikKaka{
 public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int adik = input.nextInt();
    int kakak = input.nextInt();
    int selisih = (adik > kakak) ? (adik - kakak) : (kakak - adik);
    boolean hasil = (adik == kakak) || (selisih == 3) || (selisih == 6);
    System.out.println(hasil);
 }   
}