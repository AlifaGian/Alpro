import java.util.Scanner;

public class platBandung{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String plat = input.nextLine();
        boolean bandung = (plat.charAt(0) == 'D' || plat.charAt(0) == 'd');
        //boolean bandung = (plat.charAt(0) == 'd');
        System.out.println(bandung);
    }
}