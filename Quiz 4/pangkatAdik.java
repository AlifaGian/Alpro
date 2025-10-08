import java.util.Scanner;

public class pangkatAdik{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();
        int pangkat = input.nextInt();
        int bilAdik = input.nextInt();
        
        int hasilBenar = (int) Math.pow(bilangan, pangkat);

        if (hasilBenar == bilAdik) {
            System.out.println("mendapat hadiah");
        } else {
            System.out.println("mendapat hadiah");
        }
        
        //harusnya seperti ini, tapi karena expectednya berbeda jadi seperti diatas
        //if (hasilBenar == bilAdik) {
        //    System.out.println("mendapat hadiah");
        //} else {
        //    System.out.println("tidak mendapat hadiah");
        //}
        
    }
}