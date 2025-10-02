import java.util.Scanner;

public class koin {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah koin Drachma: ");
        int drachma = input.nextInt();
        
        int mineTotal = drachma / 100; 
        int mine = mineTotal;
        int oboli = (drachma % 100) * 6;
        int atticTalent = mine / 60;

        System.out.println(atticTalent + " " + mine + " " + oboli);
    }
}
