import java.util.Scanner;
public class selisihBilangan{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int selisih = Math.abs(x - y);
        boolean hasil = (selisih == 2 || selisih == 3 || selisih == 5 || selisih == 7);
        System.out.println(hasil);
    }
}