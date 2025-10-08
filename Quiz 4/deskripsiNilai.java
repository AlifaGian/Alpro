import java.util.Scanner;

public class deskripsiNilai{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        char huruf = input.next().toUpperCase().charAt(0);
        int deskripsi;
        
        switch (huruf){
            case 'A':
                deskripsi = 5;
                break;
            case 'B':
                deskripsi = 4;
                break;
            case 'C':
                deskripsi = 3;
                break;
            case 'D':
                deskripsi = 2;
                break;
            case 'E':
                deskripsi = 1;
                break;
            case 'T':
                deskripsi = 0;
                break;
            default:
            System.out.println("Inputan tidak valid");
            return;
        }
        System.out.println(deskripsi);
    }
}