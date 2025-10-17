import java.util.Scanner;

public class Monetisasi{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int pelanggan = input.nextInt();
        int waktu = input.nextInt();
        
        if (pelanggan >= 1000 && waktu >= 4000){
            System.out.print("sudah dapat dimonetisasi");
        }
        else {
            System.out.print("belum dapat dimonetisasi");
        }
    }
}