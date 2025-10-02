import java.util.Scanner;
public class tiga {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.printf("Masukkan jumlah mil : ");
    int mil = input.nextInt();
    double km = (mil * 1.6);
    System.out.printf("%d mil sama dengan %.1f kilometer", mil, km);
}
}